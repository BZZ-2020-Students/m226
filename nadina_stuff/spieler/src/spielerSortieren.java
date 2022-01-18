import java.util.Comparator;

public class spielerSortieren implements Comparator<Spieler> {
    public int compare(Spieler alter01, Spieler alter02) {
        if (alter01.getAlter() < alter02.getAlter())
            return -1;
        else if (alter01.getAlter() == alter02.getAlter())
            return 0;
        else
            return 1;
    }
}
