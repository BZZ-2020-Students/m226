package a226.h3_2;

public class NotenDatumVergleicher implements Comparator<Note>{

    @Override
    public int compare(Note notePre, Note notePost) {
        return notePre.getDatum().after(notePost.getDatum()) ? 0 : 1;
    }
}
