package I2_1.data;

import javax.swing.*;

public class HobbyListe extends AbstractListModel<String> {
    private static final long serialVersionUID = 7326172834841098868L;

    private String[] hobby = {"Skifahren", "Fussballspielen", "Singen", "Nähen", "Tanzen", "Lesen", "Partyorganisator"};

    public HobbyListe() {
    }

    @Override
    public String getElementAt(int index) {
        // TODO Auto-generated method stub
        if (index < hobby.length)
            return hobby[index];
        else
            return null;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return hobby.length;
    }
}
