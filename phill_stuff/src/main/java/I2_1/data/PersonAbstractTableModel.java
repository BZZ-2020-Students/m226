package I2_1.data;

import javax.swing.table.AbstractTableModel;

public abstract class PersonAbstractTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L;


    public abstract void removePerson(int index);


    public abstract void addPerson(Person p);


    public abstract void sortPerson();

}
