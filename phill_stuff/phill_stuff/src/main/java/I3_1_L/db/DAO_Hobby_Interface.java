package I3_1_L.db;

import java.util.*;

/**
 * Legt die Schnittstelle für die Datenspeicherung der Hobby-Liste fest.
 * Die Daten der Hobby-Liste werden immer als Vector in serialisierter Form
 * in einer Datei gespeicehrt und von dort wieder gelesen.
 * 
 * @author	René Probst
 */
public interface DAO_Hobby_Interface {
	
	/**
	 * Speichert das gelieferte Vector-Objekt in serialisierter Form in einer Datei.
	 * 
	 * @param hobbyListe
	 * @return true wenn Objekt gespeichert wurde, sonst false
	 */
	public abstract boolean storeHobbyListe(Vector<String> hobbyListe);
	
	/**
	 * Liefert ein Vector-Objekt mit der Hobby-Liste.
	 * Die Daten werden aus einer Datei gelesen.
	 * @return ein Vectro-Objekt mit der Hobby-Liste
	 */
	public abstract Vector<String> loadHobbyListe();
}
