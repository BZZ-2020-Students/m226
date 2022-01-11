package H2_2;

import java.util.Comparator;

public class NotenDatumsVergelicher implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        return n1.getDate().compareTo(n2.getDate());
    }


}
