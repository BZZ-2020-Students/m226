package a226.h3_2;

public class NotenWertVergleicher implements Comparator<Note>{

    @Override
    public int compare(Note notePre, Note notePost) {
        if(notePre.getNote() < notePost.getNote())
            return 1;
        return 0;
    }
}
