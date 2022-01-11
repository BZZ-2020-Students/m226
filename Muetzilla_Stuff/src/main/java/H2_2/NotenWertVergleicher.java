package H2_2;

import java.util.Comparator;

public class NotenWertVergleicher implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        return Float.compare(n1.getNote(), n2.getNote());
    }
}
