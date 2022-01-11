package I1_1;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE N�TIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN


import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * Die Klasse PersonAbstractTableModel erweitert die Klasse AbstractTableModel
 * aus Java-Swing um Funktionalit�ten f�r das Entfernen, Zuf�gen und Sortieren von
 * Objekten der Klasse Person.
 * <p>
 * Die Implementation der notwendigen Methoden aus AbstractTableModel
 * erfolgen in der Unterklasse PersonenListe.
 *
 * @author Ren� Probst
 * @version 1.0
 * @date 30.12.2014
 */

public abstract class PersonAbstractTableModel extends AbstractTableModel implements TableModel {
    private static final long serialVersionUID = 1L;

    /**
     * Entfernt das durch index markierte Person-Objekt aus der Liste der Personen.
     *
     * @param index Position in der Liste, die gel�scht wird
     */
    public abstract void removePerson(int index);

    /**
     * F�gt der Liste der Personen ein neues Person-Objekt p zu.
     *
     * @param p Person-Objekt das in die Liste eingef�gt wird
     */
    public abstract void addPerson(Person p);

    /**
     * Sortiert die Liste der Personen nach dem Namen der Personen.
     */
    public abstract void sortPerson();

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
