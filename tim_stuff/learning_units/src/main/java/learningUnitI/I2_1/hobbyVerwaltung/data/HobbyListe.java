package learningUnitI.I2_1.hobbyVerwaltung.data;

import javax.swing.*;

/**
 * Die Klasse stellt eine Liste von Hobby-Bezeichnungen bereit.
 * Die Liste ist "read-only", da in der aktuellen Fassung keine Objekte eingefügt oder
 * entfernt werden können.
 * Für die Anzeige der Liste in einer JList wird das Interface ListModel implementiert.
 * 
 * @author	René Probst
 * @version	1.0
 * @date	30.12.2014
 */
public class HobbyListe extends AbstractListModel<String>{
	private static final long serialVersionUID = 7326172834841098868L;
	
	private String[] hobby =  {"Skifahren", "Fussballspielen", "Singen", "Nähen", "Tanzen", "Lesen", "Partyorganisator"};
	
	public HobbyListe(){
	}
	
	/*
	 * Implementation der Methoden der Schnittstelle ListModel.
	 * Damit die Implementation einfacher ausfällt, wird von der Komfort-Klasse
	 * AbstractListModel geerbt. Dadurch sind einige Implementation bereits 
	 * realisiert.
	 */
	
	/**
	 * Liefert die durch index markierte Hobby-Bezeichnung aus der Liste
	 * @param index Position in der Liste die gelesen wird
	 * @return Bezcihnung des Hobbys
	 */
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		if (index < hobby.length)
		  return hobby[index];
		else
		  return null;	  
	}

	/**
	 * Liefert die Grösse der Liste
	 * @return Grösse der Liste
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return hobby.length;
	}
}
