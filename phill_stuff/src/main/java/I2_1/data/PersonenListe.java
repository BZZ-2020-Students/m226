package I2_1.data;


import java.util.Collections;
import java.util.Vector;

public class PersonenListe extends PersonAbstractTableModel {
    private static final long serialVersionUID = 5997470472233122461L;
    private final String[] tableTitel = {"Name", "Vorname", "Hobby"};
    private Vector<Person> personList;


    public PersonenListe() {
        personList = new Vector<Person>();
    }

    public void setList(Person p) {
        personList.add(p);
    }

    /*
     * Implementation der Methoden der Schnittstelle TableModel.
     * Damit die Implementation einfacher ausfällt, wird von der Komfort-Klasse
     * AbstracttableModel geerbt. Dadurch sind einige Implementation bereits
     * realisiert.
     */


    @Override
    public String getColumnName(int index) {
        return tableTitel[index];
    }


    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return tableTitel.length;
    }


    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return personList.size();
    }


    @Override
    public Object getValueAt(int row, int column) {

        Person p = personList.get(row);
        switch (column) {
            case 0:
                return p.getName();
            case 1:
                return p.getPrename();
            case 2:
                return p.getHobby();
        }
        return null;
    }


    @Override
    public void removePerson(int index) {
        personList.remove(index);
        this.fireTableDataChanged();
    }


    @Override
    public void addPerson(Person p) {
        personList.add(p);
        this.fireTableDataChanged();
    }


    @Override
    public void sortPerson() {
        Collections.sort(personList);
        this.fireTableDataChanged();
    }
}
