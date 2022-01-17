import java.util.Comparator;

public class NotenWertVergleicher implements Comparator<Note> {

    public int compare(Note notePre, Note notePost) {
        if (notePre.getNote() < notePost.getNote())
            return -1;
        else if (notePre.getNote() == notePost.getNote())
            return 0;
        else
            return 1;
    }
}
