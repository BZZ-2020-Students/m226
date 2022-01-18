package H3_2;

import java.util.Comparator;

public class NotenWertVergleicher implements Comparator<Note> {
    @Override
    public int compare(Note notePre, Note notePost) {
        return Float.compare(notePost.getNotenwert(),notePre.getNotenwert());
    }
}
