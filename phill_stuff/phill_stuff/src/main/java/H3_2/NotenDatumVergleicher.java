package H3_2;

import java.util.Comparator;

public class NotenDatumVergleicher implements Comparator<Note> {
    @Override
    public int compare(Note notePre, Note notePost) {
        return notePre.getDatum().compareTo(notePost.getDatum());
    }
}
