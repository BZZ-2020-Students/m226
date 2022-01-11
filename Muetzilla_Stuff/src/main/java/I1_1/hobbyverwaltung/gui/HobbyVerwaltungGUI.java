package I1_1.hobbyverwaltung.gui;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE N�TIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

// ES SIND HIER ZIEMLICH VIELE JAVA-BIBLIOTHEKEN N�TIG!

// AM DIESEM CODE BITTE KEINE ANPASSUNGEN VORNEHMEN. WENN DIE AUSGABE
// NICHT KORREKT ERFOLGT, LIEGT DER FEHELR AUF SEITEN DER DATEN-MODELLE.

import I1_1.hobbyverwaltung.data.Person;
import I1_1.hobbyverwaltung.data.PersonAbstractTableModel;

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
 * Die Klasse HobyyVerwaltungGUI liefert die Benutzeroberfl�che f�r die HobbyVerwaltung.
 * Die Klasse bezieht Daten aus HobbyListe (implementiert ein ListModel) und aus
 * I1_1.hobbyverwaltung.data.PersonenListe (implementiert ein TableModel).
 * <p>
 * Sie regelt den Datenaustausch �ber das MVC-Modell von Swing.
 * <p>
 * Die Personen mit ihrem bevorzugten Hobby - es gibt nur ein Hobby, das pro I1_1.hobbyverwaltung.data.Person
 * zugeteilt wird - werden in einer Tabelle im Hauptfenster angezeigt.
 * F�r die Bearbeitung sind entsprechende Dialog-Fenster verf�gbar.
 * <p>
 * Die Liste der verf�gbaren Hobby wird in einem Dialog-Fenster ausgegeben.
 *
 * @author Ren� Probst
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
    private ListModel<String> hobbyliste;
    private PersonAbstractTableModel tableModel;
    private JFrame gui;

    /**
     * Konstruktor erstellt alle Elemente f�r das GUI.
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
        // setze Men� f�r die Hobbyliste
        initMenu();
        // erstellt Tabelle mit allen Daten
        initTable();
        // erstellt Schaltfl�chen und deren Aktionen
        initBtn();
        initAction();
    }

    /*
     * Initialisiert das Men� des GUI.
     * Das Men� besteht aus einem Eintrag 'Hobby' und einem Untereintrag 'Hobby Liste anzeigen'.
     * Wird der Untereintrag angew�hlt, wird der Dialog f�r die Anzeige der Hobbies in einer
     * JList ge�ffnet.
     * Die Aktion kann auch �ber die Tastenkombination Ctrl-L ausgel�st werden.
     */
    private void initMenu() {
        // Einrichten des Men�-Objektes f�r dieses Fenster
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        // Erstellen des Men�s 'Hobby'
        hobbyMenu = new JMenu("Hobby");
        hobbyMenu.setMnemonic(KeyEvent.VK_H);
        // Erstellen des Untermen�s 'Hobby Liste anzeigen'
        hobbyMenuItem = new JMenuItem("Hobby Liste anzeigen");
        hobbyMenuItem.setMnemonic(KeyEvent.VK_A);
        hobbyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        // Anonyme Klasse die das Interface ActionListener implementiert.
        // Die Funktion actionPerformed wird aufgerufen, wenn das Untermen� angew�hlt
        // oder die Tastenkombination Ctrl-L gedr�ckt wird
        hobbyMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HobbyListDialog(gui, hobbyliste);
            }
        });
        // Die Men�-Objekte eintragen
        hobbyMenu.add(hobbyMenuItem);
        menubar.add(hobbyMenu);
    }

    /*
     * Initialsiert die Tabelle.
     * Die Daten stammen aus dem Model I1_1.hobbyverwaltung.data.PersonenListe.
     * Die Tabelle wird in einen scroll-f�higen Bereich eingebunden, so dass
     * die Fenstergr�sse keine Begrenzung bez�glich der anzeigbaren Daten darstellt.
     *
     * F�r die Ausgabe wird der Default-Renderer angepasst, so dass die Zeilen
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
     * Initialisiert die Schaltfl�chen und positioniert diese im GUI.
     * Die Schaltfl�chen werden am unternen Fensterrand angeordnet (Bereich
     * SOUTH im BorderLayout).
     *
     * Die Schaltfl�che removeBtn wird auf disbale gesetzt. Sie darf nur aktiv
     * sein, wenn in der Tabelle eine Zeile angew�hlt wird.
     */
    private void initBtn() {
        addBtn = new JButton("I1_1.hobbyverwaltung.data.Person zuf�gen");
        removeBtn = new JButton("I1_1.hobbyverwaltung.data.Person entfernen");
        sortBtn = new JButton("sortieren");
        removeBtn.setEnabled(false);
        removeBtn.setToolTipText("Markieren Sie eine I1_1.hobbyverwaltung.data.Person in der Tabelle, um sie dann zu l�schen");
        addBtn.setToolTipText("�ffnet einen Dialog, um eine neue I1_1.hobbyverwaltung.data.Person zu erfassen");
        sortBtn.setToolTipText("Sortiert die Liste nach Namen");
        // Anordnen der Schaltfl�chen im Layout von Swing
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
        // Sobald eine Zeile in der Tabelle angew�hlt ist, wird
        // die Schaltfl�che removeBtn aktiviert.
        theTable.setRowSelectionAllowed(true);
        ListSelectionModel selectionModel = theTable.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                onTableSelected();
            }
        });
        // L�schen-Schaltfl�che wird gedr�ckt
        // L�scht den in der Tablle markierten Eintrag in der Personenliste
        removeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onRemovePerson();
            }
        });
        // Zuf�gen-Schaltfl�che wird gedr�ckt
        // �ffnet den Dialog f�r die Erfassung von Personen und deren Hobby
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAddPerson();
            }
        });
        // Sortieren-Schaltfl�che wird gedr�ckt
        // Sortiert die Personenliste
        sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onSort();
            }
        });
    }

    /*
     * Setzt die Schaltfl�che removeBt auf aktiv, so dass die selektierte Zeile
     * gel�scht werden kann.
     */
    private void onTableSelected() {
        removeBtn.setEnabled(true);
        //System.out.println("ROW = "+theTable.getSelectedRow());
    }

    /*
     * L�scht die in der Tablle markierte I1_1.hobbyverwaltung.data.Person aus der Liste
     * und deaktiviert die Schaltfl�ce removeBtn
     */
    private void onRemovePerson() {
        tableModel.removePerson(theTable.getSelectedRow());
        removeBtn.setEnabled(false);
    }

    /*
     * F�gt in der Liste eine neue I1_1.hobbyverwaltung.data.Person zu, sofern der
     * Dialog entsprechend quittiert wird.
     * Dem Dialog m�ssen die Referenzen zu den Daten
     * mitgeliefert werden.
     */
    private void onAddPerson() {
        new PersonAddDialog(gui, tableModel, hobbyliste);
    }

    /*
     * Sortiert die Personenliste entsprechend der compareTo-Methode
     * der Klasse I1_1.hobbyverwaltung.data.Person.
     */
    private void onSort() {
        tableModel.sortPerson();
    }
}

/*-------------------------------------------------------------------------------------------------------*/

/**
 * Die Klasse HobbyListDialog stellt ein Fenster f�r die Bearbeitung von
 * Hobbys bereit.
 * In der aktuellen Fassung kann nur eine Liste von vorgegebenen Hobbys
 * angezeigt werden, da auf Seiten des Models keine Methode f�r das Zuf�gen
 * und L�schen von Daten existiert.
 * Der Dialog wird �ber [x] beendet.
 *
 * @author Ren� Probst
 * @version 1.0
 * @date 29.12.2014
 */
class HobbyListDialog extends JDialog {
    private static final long serialVersionUID = -8998635460884782229L;
    //
    private JList<String> hobbyListComponent;
    private ListModel<String> model;

    /**
     * Erstellt einen Dilaog f�r die Ausagbe einer Liste von Hobby-Bezeichnungen.
     * Der Dialog wird als modal deklariert.
     *
     * @param owner Referenz des �bergeordneten Fenster-Objekts
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
     * Die Liste wird in einen scroll-f�higen Bereich eingebunden, so dass
     * die Fenstergr�sse keine Begrenzung bez�glich der anzeigbaren Daten darstellt.
     */
    private void init() {
        hobbyListComponent = new JList<String>(this.model);
        JScrollPane pane = new JScrollPane(hobbyListComponent);
        this.getContentPane().add(pane);
    }
}


/*-------------------------------------------------------------------------------------------------------*/

/**
 * Die Klasse PersonAddDialog stellt eine Dialog f�r das Erfassen von
 * Personen mit ihrem Hobby bereit.
 *
 * @author Ren� Probst
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
    private PersonAbstractTableModel tableModel;
    private Vector<String> hobbyListe;

    /**
     * Erstellt einen Dialog f�r die Eingabe von Personendaten.
     * Der Dialog wird �ber [x] beendet.
     *
     * @param owner      Referenz des �bergeordneten Fenster-Objekts
     * @param tableModel Referenz auf die Liste der Personen (PersonenLise)
     * @param hobbyModel Referenz auf die Liste der Hobbies (HobbyListe)
     */
    public PersonAddDialog(JFrame owner, PersonAbstractTableModel tableModel, ListModel<String> hobbyModel) {
        super(owner, "I1_1.hobbyverwaltung.data.Person erfassen", true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //
        this.tableModel = tableModel;
        // Aus den Daten des Hobby-Models eine "kombatibles" Objekt f�r eine JComboBox aufbereiten.
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
     * Erstellt die Label, Eingabe-Komponeneten und Schaltfl�chen
     */
    private void init() {
        name = new JTextField(40);
        preName = new JTextField(40);
        hobbySelection = new JComboBox<String>(hobbyListe);
        storeBtn = new JButton("zuf�gen");
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
        // Zuf�gen-Schaltfl�che wird gedr�ckt
        // Speichert die Daten zu einer I1_1.hobbyverwaltung.data.Person in der Personenliste
        storeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onStore();
            }
        });
        // Taste in Textfeld name wird gedr�ckt
        // Wenn die Taste ENTER erkannt wird, wird der Fokus
        // auf das n�chste Eingabe-Element gesetzt
        name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    preName.requestFocus();
            }
        });
        // Taste in Textfeld preName wird gedr�ckt
        // Wenn die Taste ENTER erkannt wird, wird der Fokus
        // auf das n�chste Eingabe-Element gesetzt
        preName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    hobbySelection.requestFocus();
            }
        });
    }


    /*
     * Speichert die Daten zu einer I1_1.hobbyverwaltung.data.Person in der Personenliste
     * Wenn die Daten gespeichert sind, werden die Eingabefelder gel�scht und
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
 * Die CellRendere-Klasse ist daf�r besorgt, dass in einer JTable die
 * Zeilen mit wechselndem Hintergrund ausgegeben werden.
 *
 * @author Ren� Probst
 * @version 1.0
 * @date 29.12.2014
 */
class CellRenderer extends DefaultTableCellRenderer {
    private static final long serialVersionUID = 1340236612207943527L;
    // Farben f�r den Hintergrund
    final private Color BG = new Color(224, 250, 248);
    final private Color BG_ = Color.white;

    /*
     * Die Methode der Oberklasse hier �berschreiben.
     * Es wird der Hintergrund gesetzt. Weitere Anpassungen am Renderer werde nicht
     * vorgenommen.
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (row % 2 == 0)
            this.setBackground(BG);
        else
            this.setBackground(BG_);
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
