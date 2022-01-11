package I1_1_phill.gui;

// HIER ALLE NÖTIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

// ES SIND HIER ZIEMLICH VIELE JAVA-BIBLIOTHEKEN NÖTIG!

// AM DIESEM CODE BITTE KEINE ANPASSUNGEN VORNEHMEN. WENN DIE AUSGABE
// NICHT KORREKT ERFOLGT, LIEGT DER FEHELR AUF SEITEN DER DATEN-MODELLE.

import I1_1_phill.data.Person;
import I1_1_phill.data.PersonAbstractTableModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;


public class HobbyVerwaltungGUI extends JFrame {
    private static final long serialVersionUID = -3416521876980155265L;
    //
    private JMenuBar menubar;
    private JMenu hobbyMenu;
    private JMenuItem hobbyMenuItem;
    private JTable theTable;
    private JButton removeBtn, addBtn, sortBtn;
    //
    private ListModel<String> hobbyliste;
    private PersonAbstractTableModel tableModel;
    private JFrame gui;


    public HobbyVerwaltungGUI(ListModel<String> hobbyliste, PersonAbstractTableModel tableModel) {
        super("Hobby-Verwaltung");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        gui = this;
        this.hobbyliste = hobbyliste;
        this.tableModel = tableModel;
        //
        init();
        //
        this.pack();
        this.setVisible(true);
    }


    private void init() {
        // setze Menü für die Hobbyliste
        initMenu();
        // erstellt Tabelle mit allen Daten
        initTable();
        // erstellt Schaltflächen und deren Aktionen
        initBtn();
        initAction();
    }


    private void initMenu() {
        // Einrichten des Menü-Objektes für dieses Fenster
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        // Erstellen des Menüs 'Hobby'
        hobbyMenu = new JMenu("Hobby");
        hobbyMenu.setMnemonic(KeyEvent.VK_H);
        // Erstellen des Untermenüs 'Hobby Liste anzeigen'
        hobbyMenuItem = new JMenuItem("Hobby Liste anzeigen");
        hobbyMenuItem.setMnemonic(KeyEvent.VK_A);
        hobbyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        // Anonyme Klasse die das Interface ActionListener implementiert.
        // Die Funktion actionPerformed wird aufgerufen, wenn das Untermenü angewählt
        // oder die Tastenkombination Ctrl-L gedrückt wird
        hobbyMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HobbyListDialog(gui, hobbyliste);
            }
        });
        // Die Menü-Objekte eintragen
        hobbyMenu.add(hobbyMenuItem);
        menubar.add(hobbyMenu);
    }


    private void initTable() {
        theTable = new JTable(tableModel);
        JScrollPane pane = new JScrollPane(theTable);
        this.getContentPane().add(pane, BorderLayout.CENTER);
        // Renderer anpassen
        theTable.setDefaultRenderer(Object.class, new CellRenderer());
    }


    private void initBtn() {
        addBtn = new JButton("Person zufügen");
        removeBtn = new JButton("Person entfernen");
        sortBtn = new JButton("sortieren");
        removeBtn.setEnabled(false);
        removeBtn.setToolTipText("Markieren Sie eine Person in der Tabelle, um sie dann zu löschen");
        addBtn.setToolTipText("Öffnet einen Dialog, um eine neue Person zu erfassen");
        sortBtn.setToolTipText("Sortiert die Liste nach Namen");
        // Anordnen der Schaltflächen im Layout von Swing
        JPanel btnPane = new JPanel(new GridLayout(1, 2));
        btnPane.add(removeBtn);
        btnPane.add(addBtn);
        JPanel footPane = new JPanel(new BorderLayout());
        footPane.add(btnPane, BorderLayout.EAST);
        footPane.add(sortBtn, BorderLayout.WEST);
        this.getContentPane().add(footPane, BorderLayout.SOUTH);
    }

    private void initAction() {
        // Tabelle wird fokusiert
        // Sobald eine Zeile in der Tabelle angewählt ist, wird
        // die Schaltfläche removeBtn aktiviert.
        theTable.setRowSelectionAllowed(true);
        ListSelectionModel selectionModel = theTable.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                onTableSelected();
            }
        });
        // Löschen-Schaltfläche wird gedrückt
        // Löscht den in der Tablle markierten Eintrag in der Personenliste
        removeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRemovePerson();
            }
        });
        // Zufügen-Schaltfläche wird gedrückt
        // Öffnet den Dialog für die Erfassung von Personen und deren Hobby
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAddPerson();
            }
        });
        // Sortieren-Schaltfläche wird gedrückt
        // Sortiert die Personenliste
        sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onSort();
            }
        });
    }


    private void onTableSelected() {
        removeBtn.setEnabled(true);
        //System.out.println("ROW = "+theTable.getSelectedRow());
    }


    private void onRemovePerson() {
        tableModel.removePerson(theTable.getSelectedRow());
        removeBtn.setEnabled(false);
    }


    private void onAddPerson() {
        new PersonAddDialog(gui, tableModel, hobbyliste);
    }


    private void onSort() {
        tableModel.sortPerson();
    }
}

class HobbyListDialog extends JDialog {
    private static final long serialVersionUID = -8998635460884782229L;
    //
    private JList<String> hobbyListComponent;
    private ListModel<String> model;

    /**
     * Erstellt einen Dilaog für die Ausagbe einer Liste von Hobby-Bezeichnungen.
     * Der Dialog wird als modal deklariert.
     *
     * @param owner Referenz des übergeordneten Fenster-Objekts
     * @param model Referenz auf die Liste der Hobbies (HobbyListe)
     */
    public HobbyListDialog(JFrame owner, ListModel<String> model) {
        super(owner, "Hobby-Liste", true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //
        this.model = model;
        //
        init();
        //
        this.pack();
        this.setSize(200, (int) getPreferredSize().getHeight());
        this.setVisible(true);
    }


    private void init() {
        hobbyListComponent = new JList<String>(this.model);
        JScrollPane pane = new JScrollPane(hobbyListComponent);
        this.getContentPane().add(pane);
    }
}


/*-------------------------------------------------------------------------------------------------------*/


class PersonAddDialog extends JDialog {
    private static final long serialVersionUID = 7425353894108773753L;
    //
    private JTextField name, preName;
    private JComboBox<String> hobbySelection;
    private JButton storeBtn;
    //
    private PersonAbstractTableModel tableModel;
    private Vector<String> hobbyListe;


    public PersonAddDialog(JFrame owner, PersonAbstractTableModel tableModel, ListModel<String> hobbyModel) {
        super(owner, "Person erfassen", true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //
        this.tableModel = tableModel;
        // Aus den Daten des Hobby-Models eine "kombatibles" Objekt für eine JComboBox aufbereiten.
        hobbyListe = new Vector<String>();
        for (int i = 0; i < hobbyModel.getSize(); i++)
            hobbyListe.add(hobbyModel.getElementAt(i));
        //
        init();
        initAction();
        //
        this.pack();
        this.setSize(200, (int) getPreferredSize().getHeight());
        this.setVisible(true);
    }


    private void init() {
        name = new JTextField(40);
        preName = new JTextField(40);
        hobbySelection = new JComboBox<String>(hobbyListe);
        storeBtn = new JButton("zufügen");
        // Anordnen der Komponenten im Layout von Swing
        JPanel inputPane = new JPanel(new GridLayout(3, 2));
        inputPane.add(new JLabel("Name:"));
        inputPane.add(name);
        inputPane.add(new JLabel("Vorname: "));
        inputPane.add(preName);
        inputPane.add(new JLabel("Hobby: "));
        inputPane.add(hobbySelection);
        this.getContentPane().add(inputPane, BorderLayout.CENTER);
        //
        JPanel btnPanel = new JPanel(new BorderLayout());
        btnPanel.add(storeBtn, BorderLayout.EAST);
        this.getContentPane().add(btnPanel, BorderLayout.SOUTH);
    }


    private void initAction() {
        // Zufügen-Schaltfläche wird gedrückt
        // Speichert die Daten zu einer Person in der Personenliste
        storeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onStore();
            }
        });
        // Taste in Textfeld name wird gedrückt
        // Wenn die Taste ENTER erkannt wird, wird der Fokus
        // auf das nächste Eingabe-Element gesetzt
        name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    preName.requestFocus();
            }
        });
        // Taste in Textfeld preName wird gedrückt
        // Wenn die Taste ENTER erkannt wird, wird der Fokus
        // auf das nächste Eingabe-Element gesetzt
        preName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    hobbySelection.requestFocus();
            }
        });
    }


    private void onStore() {
        Person p = new Person(name.getText(), preName.getText(), (String) hobbySelection.getSelectedItem());
        this.tableModel.addPerson(p);
        // Initilaisiere Eingabefelder
        name.setText("");
        preName.setText("");
        hobbySelection.setSelectedIndex(0);
        name.requestFocus();
    }
}

/*-------------------------------------------------------------------------------------------------------*/


class CellRenderer extends DefaultTableCellRenderer {
    private static final long serialVersionUID = 1340236612207943527L;
    // Farben für den Hintergrund
    final private Color BG = new Color(224, 250, 248);
    final private Color BG_ = Color.white;


    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (row % 2 == 0)
            this.setBackground(BG);
        else
            this.setBackground(BG_);
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
