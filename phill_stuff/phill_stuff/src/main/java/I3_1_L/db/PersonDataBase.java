package I3_1_L.db;

import I3_1_L.data.Person;


import java.io.*;
import java.util.HashMap;
import java.util.Vector;

/**
 * Implementiert eine Datenbank für die Personenobjekte.
 * Jedes Person-Objekt wird in serialisierter Form in einer eigenen Datei gespeichert.
 * Die Klasse übernimmt die Verwaltung dieswer Dateien im Sinn einer Datenbank.
 * 
 * @author	René Probst
 */
public class PersonDataBase implements DAO_Person_Interface {

	private final String fileName4FilenaemListe = "filenamelist.vvd";
	private HashMap<Integer, String> fileNames;
	private Vector<String> fileNameListe;
	
	public PersonDataBase(){
		// Erstellt die Komponenten für die Verwaltung der Objekt-Dateien der Datenbank
		// fileNamListe hält eine aktuelle Liste aller Dateinamen
		// fielNames hält eine Zuordnung von Dateinamen zu Objekt-Referenzen
		// Liste der Dateinamen einlesen
		fileNames = new HashMap<Integer, String>();

		if ( (fileNameListe = readFileNameListe()) == null){ 
			fileNameListe = new Vector<>();
		}
	}
	
	/**
	 * Fügt ein Personen-Objekt p in der Datenbank ein.
	 * @param p Personen-Objekt das eingefügt wird
	 */
	public  void insertPerson(Person p){
		System.out.println("INSERT : "+p);
		// aus den Objekt-Inforamtionen einen Filenamen erstellen.		
		String fileName = p.hashCode() + ".pvd";
		try{
			// Datei speichern....
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(p);
		    oos.close();
		    // ... OK und jetzt alle Verwaltungskomponenten nachführen
		    fileNames.put(p.hashCode(), fileName);
			fileNameListe.add(fileName);
			storeFileNameListe();
		}
		catch(FileNotFoundException err){
			System.out.println(err);
		}
		catch(IOException err){
			System.out.println(err);
		}
	}
	
	/**
	 * Entfernt ein Personen-Objekt p aus der Datenbank.
	 * @param p Personen-Objekt das gelöscht wird
	 */
	public void removePerson(Person p){
		System.out.println("DELETE : "+p);
		// liest Dateinamen 
		String fileName = fileNames.get(p.hashCode());
		try{
		 // Datei löschen....
		 File filename = new File(fileName);
		 filename.delete();
		 // ....OK und jetzt Verwaltungskomponenten nachführen
		 fileNames.remove(p.hashCode());
		 fileNameListe.remove(fileName);
		 storeFileNameListe();
		}
		catch(NullPointerException err){
			System.out.println(err);
		}
	}
	
	/**
	 * Liefert eine Datenstruktur mit allen Personen-Objekten der Datenbank.
	 * @return Vector mit allen Personen-Objekten
	 */
	public Vector<Person> selectAll(){
		FileInputStream fis;
		ObjectInputStream ois;
		Vector<Person> pl;
		
		System.out.println("SELECTALL");
		// alle DAteien gemäss der Liste auslesen, Objekte erzeugen und in HashMap auch nachführen
		if (!fileNameListe.isEmpty()){
			pl = new Vector<Person>();
			for (String fileName : fileNameListe){
				System.out.println(fileName);
				
				try{
					  fis = new FileInputStream(fileName);
				      ois = new ObjectInputStream(fis);
				      Person p =  (Person) ois.readObject();
				      ois.close();

				      pl.add(p);
				      fileNames.put(p.hashCode(), fileName);
					}
				catch(FileNotFoundException err){
					System.out.println(err);
				}
				catch(IOException err){
					System.out.println(err);
				}
				catch(ClassNotFoundException err){
					System.out.println(err);
				}
			}
			return pl;
		}
		else
		  return null;
	}
	
	/*
	 * speichert nach jeder Dateioperation die angepasste Liste
	 */
	private void storeFileNameListe(){
		try{
			FileOutputStream fos = new FileOutputStream(fileName4FilenaemListe);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(fileNameListe);
		    oos.close();
		}
		catch(FileNotFoundException err){
			System.out.println(err);
		}
		catch(IOException err){
			System.out.println(err);
		}
	}
	
	
	private Vector<String> readFileNameListe(){
		try{
			  FileInputStream fis = new FileInputStream(fileName4FilenaemListe);
		      ObjectInputStream ois = new ObjectInputStream(fis);
		      Vector<String> s =  (Vector<String>) ois.readObject();
		      ois.close();
		      return s;
			}
		catch(FileNotFoundException err){
			System.out.println(err);
		}
		catch(IOException err){
			System.out.println(err);
		}
		catch(ClassNotFoundException err){
			System.out.println(err);
		}
		return null;
	}
}
