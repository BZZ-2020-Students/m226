package I1_1.HobbyListe.data;

import javax.swing.*;

public abstract class HobbyAbstractListModel extends AbstractListModel {

    public abstract void removeHobby(int index);

    public abstract void addHobby(String h);


    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Object getElementAt(int index) {
        return null;
    }
}
