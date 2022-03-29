package I3_1.data;

import javax.swing.*;

/**
 * Die Klasse stellt eine Liste von Hobby-Bezeichnungen bereit.
 * Die Liste ist "read-only", da in der aktuellen Fassung keine Objekte eingef�gt oder
 * entfernt werden k�nnen.
 * F�r die Anzeige der Liste in einer JList wird das Interface ListModel implementiert.
 * 
 * @author	Ren� Probst
 * @version	1.0
 * @date	30.12.2014
 *
 */
public class HobbyListe extends AbstractListModel<String>{
	private static final long serialVersionUID = 7326172834841098868L;
	
	private String[] hobby =  {"Skifahren", "Fussballspielen", "Singen", "N�hen", "Tanzen", "Lesen", "Partyorganisator"};
	
	public HobbyListe(){
	}
	
	/*
	 * Implementation der Methoden der Schnittstelle ListModel.
	 * Damit die Implementation einfacher ausf�llt, wird von der Komfort-Klasse
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
	 * Liefert die Gr�sse der Liste
	 * @return Gr�sse der Liste
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return hobby.length;
	}
}
