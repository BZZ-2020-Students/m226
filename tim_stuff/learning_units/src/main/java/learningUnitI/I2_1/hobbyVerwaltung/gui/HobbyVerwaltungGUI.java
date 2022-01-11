package learningUnitI.I2_1.hobbyVerwaltung.gui;

// HIER ALLE NÖTIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

// ES SIND HIER ZIEMLICH VIELE JAVA-BIBLIOTHEKEN NÖTIG!

// AM DIESEM CODE BITTE KEINE ANPASSUNGEN VORNEHMEN. WENN DIE AUSGABE
// NICHT KORREKT ERFOLGT, LIEGT DER FEHELR AUF SEITEN DER DATEN-MODELLE.

import learningUnitI.I2_1.hobbyVerwaltung.data.Person;
import learningUnitI.I2_1.hobbyVerwaltung.data.PersonAbstractTableModel;

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

/**
 * Die Klasse HobyyVerwaltungGUI liefert die Benutzeroberfläche für die HobbyVerwaltung.
 * Die Klasse bezieht Daten aus HobbyListe (implementiert ein ListModel) und aus
 * PersonenListe (implementiert ein TableModel).
 * <p>
 * Sie regelt den Datenaustausch über das MVC-Modell von Swing.
 * <p>
 * Die Personen mit ihrem bevorzugten Hobby - es gibt nur ein Hobby, das pro Person
 * zugeteilt wird - werden in einer Tabelle im Hauptfenster angezeigt.
 * Für die Bearbeitung sind entsprechende Dialog-Fenster verfügbar.
 * <p>
 * Die Liste der verfügbaren Hobby wird in einem Dialog-Fenster ausgegeben.
 *
 * @author René Probst
 * @version 1.0
 * @date 30.12.2014
 */
public class HobbyVerwaltungGUI extends JFrame {
    private static final long serialVersionUID = -3416521876980155265L;
    //
    private JMenuBar menubar;
    private JMenu hobbyMenu;
    private JMenuItem hobbyMenuItem;
    private JTable theTable;
    private JButton removeBtn, addBtn, sortBtn;
    //
    private final ListModel<String> hobbyliste;
    private final PersonAbstractTableModel tableModel;
    private final JFrame gui;

    /**
     * Konstruktor erstellt alle Elemente für das GUI.
     *
     * @param hobbyliste Referenz auf die Liste der Hobbies (HobbyListe)
     * @param tableModel Referenz auf die Liste der Personen (PersoenListe)
     */
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

    /*
     * Initialisiert die graphischen Komponenten
     */
    private void init() {
        // setze Menü für die Hobbyliste
        initMenu();
        // erstellt Tabelle mit allen Daten
        initTable();
        // erstellt Schaltflächen und deren Aktionen
        initBtn();
        initAction();
    }

    /*
     * Initialisiert das Menü des GUI.
     * Das Menü besteht aus einem Eintrag 'Hobby' und einem Untereintrag 'Hobby Liste anzeigen'.
     * Wird der Untereintrag angewählt, wird der Dialog für die Anzeige der Hobbies in einer
     * JList geöffnet.
     * Die Aktion kann auch über die Tastenkombination Ctrl-L ausgelöst werden.
     */
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
            public void actionPerformed(ActionEvent e) {
                new HobbyListDialog(gui, hobbyliste);
            }
        });
        // Die Menü-Objekte eintragen
        hobbyMenu.add(hobbyMenuItem);
        menubar.add(hobbyMenu);
    }

    /*
     * Initialsiert die Tabelle.
     * Die Daten stammen aus dem Model PersonenListe.
     * Die Tabelle wird in einen scroll-fähigen Bereich eingebunden, so dass
     * die Fenstergrösse keine Begrenzung bezüglich der anzeigbaren Daten darstellt.
     *
     * Für die Ausgabe wird der Default-Renderer angepasst, so dass die Zeilen
     * jeweils mit wechselndem Hintergrund dargestellt werden.
     */
    private void initTable() {
        theTable = new JTable(tableModel);
        JScrollPane pane = new JScrollPane(theTable);
        this.getContentPane().add(pane, BorderLayout.CENTER);
        // Renderer anpassen
        theTable.setDefaultRenderer(Object.class, new CellRenderer());
    }

    /*
     * Initialisiert die Schaltflächen und positioniert diese im GUI.
     * Die Schaltflächen werden am unternen Fensterrand angeordnet (Bereich
     * SOUTH im BorderLayout).
     *
     * Die Schaltfläche removeBtn wird auf disbale gesetzt. Sie darf nur aktiv
     * sein, wenn in der Tabelle eine Zeile angewählt wird.
     */
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

    /*
     * Legt die Aktionen der Komponenten fest
     */
    private void initAction() {
        // Tabelle wird fokusiert
        // Sobald eine Zeile in der Tabelle angewählt ist, wird
        // die Schaltfläche removeBtn aktiviert.
        theTable.setRowSelectionAllowed(true);
        ListSelectionModel selectionModel = theTable.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                onTableSelected();
            }
        });
        // Löschen-Schaltfläche wird gedrückt
        // Löscht den in der Tablle markierten Eintrag in der Personenliste
        removeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onRemovePerson();
            }
        });
        // Zufügen-Schaltfläche wird gedrückt
        // Öffnet den Dialog für die Erfassung von Personen und deren Hobby
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onAddPerson();
            }
        });
        // Sortieren-Schaltfläche wird gedrückt
        // Sortiert die Personenliste
        sortBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onSort();
            }
        });
    }

    /*
     * Setzt die Schaltfläche removeBt auf aktiv, so dass die selektierte Zeile
     * gelöscht werden kann.
     */
    private void onTableSelected() {
        removeBtn.setEnabled(true);
        //System.out.println("ROW = "+theTable.getSelectedRow());
    }

    /*
     * Löscht die in der Tablle markierte Person aus der Liste
     * und deaktiviert die Schaltfläce removeBtn
     */
    private void onRemovePerson() {
        tableModel.removePerson(theTable.getSelectedRow());
        removeBtn.setEnabled(false);
    }

    /*
     * Fügt in der Liste eine neue Person zu, sofern der
     * Dialog entsprechend quittiert wird.
     * Dem Dialog müssen die Referenzen zu den Daten
     * mitgeliefert werden.
     */
    private void onAddPerson() {
        new PersonAddDialog(gui, tableModel, hobbyliste);
    }

    /*
     * Sortiert die Personenliste entsprechend der compareTo-Methode
     * der Klasse Person.
     */
    private void onSort() {
        tableModel.sortPerson();
    }
}

/*-------------------------------------------------------------------------------------------------------*/

/**
 * Die Klasse HobbyListDialog stellt ein Fenster für die Bearbeitung von
 * Hobbys bereit.
 * In der aktuellen Fassung kann nur eine Liste von vorgegebenen Hobbys
 * angezeigt werden, da auf Seiten des Models keine Methode für das Zufügen
 * und Löschen von Daten existiert.
 * Der Dialog wird über [x] beendet.
 *
 * @author René Probst
 * @version 1.0
 * @date 29.12.2014
 */
class HobbyListDialog extends JDialog {
    private static final long serialVersionUID = -8998635460884782229L;
    //
    private JList<String> hobbyListComponent;
    private final ListModel<String> model;

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

    /*
     * Initialisiert die graphischen Komponenten.
     * Die Liste wird mit den Daten des Models aufgebaut.
     *
     * Die Liste wird in einen scroll-fähigen Bereich eingebunden, so dass
     * die Fenstergrösse keine Begrenzung bezüglich der anzeigbaren Daten darstellt.
     */
    private void init() {
        hobbyListComponent = new JList<String>(this.model);
        JScrollPane pane = new JScrollPane(hobbyListComponent);
        this.getContentPane().add(pane);
    }
}


/*-------------------------------------------------------------------------------------------------------*/

/**
 * Die Klasse PersonAddDialog stellt eine Dialog für das Erfassen von
 * Personen mit ihrem Hobby bereit.
 *
 * @author René Probst
 * @version 1.0
 * @date 29.12.2014
 */
class PersonAddDialog extends JDialog {
    private static final long serialVersionUID = 7425353894108773753L;
    //
    private JTextField name, preName;
    private JComboBox<String> hobbySelection;
    private JButton storeBtn;
    //
    private final PersonAbstractTableModel tableModel;
    private final Vector<String> hobbyListe;

    /**
     * Erstellt einen Dialog für die Eingabe von Personendaten.
     * Der Dialog wird über [x] beendet.
     *
     * @param owner      Referenz des übergeordneten Fenster-Objekts
     * @param tableModel Referenz auf die Liste der Personen (PersonenLise)
     * @param hobbyModel Referenz auf die Liste der Hobbies (HobbyListe)
     */
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

    /*
     * Erstellt die Label, Eingabe-Komponeneten und Schaltflächen
     */
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

    /*
     * Legt die Aktionen der Komponenten fest
     */
    private void initAction() {
        // Zufügen-Schaltfläche wird gedrückt
        // Speichert die Daten zu einer Person in der Personenliste
        storeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onStore();
            }
        });
        // Taste in Textfeld name wird gedrückt
        // Wenn die Taste ENTER erkannt wird, wird der Fokus
        // auf das nächste Eingabe-Element gesetzt
        name.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    preName.requestFocus();
            }
        });
        // Taste in Textfeld preName wird gedrückt
        // Wenn die Taste ENTER erkannt wird, wird der Fokus
        // auf das nächste Eingabe-Element gesetzt
        preName.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    hobbySelection.requestFocus();
            }
        });
    }


    /*
     * Speichert die Daten zu einer Person in der Personenliste
     * Wenn die Daten gespeichert sind, werden die Eingabefelder gelöscht und
     * der Cursor auf das erste Eingabefeld gesetzt
     */
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

/**
 * Die CellRendere-Klasse ist dafür besorgt, dass in einer JTable die
 * Zeilen mit wechselndem Hintergrund ausgegeben werden.
 *
 * @author René Probst
 * @version 1.0
 * @date 29.12.2014
 */
class CellRenderer extends DefaultTableCellRenderer {
    private static final long serialVersionUID = 1340236612207943527L;
    // Farben für den Hintergrund
    final private Color BG = new Color(224, 250, 248);
    final private Color BG_ = Color.white;

    /*
     * Die Methode der Oberklasse hier überschreiben.
     * Es wird der Hintergrund gesetzt. Weitere Anpassungen am Renderer werde nicht
     * vorgenommen.
     */
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (row % 2 == 0)
            this.setBackground(BG);
        else
            this.setBackground(BG_);
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
