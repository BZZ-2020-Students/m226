package I3_1_L.db;

import java.io.*;
import java.util.Vector;

public class HobbyDataBase implements DAO_Hobby_Interface {
	
	private final String fileName = "hobbyliste.hvd";
	
	public HobbyDataBase(){
		
	}

	/**
	 * Speichert das gelieferte Vector-Objekt in serialisierter Form in einer Datei.
	 * Die Dateinamen werden in einer Hashmap verwlatet, so dass zwischen Objekt und Datei ein Bezug besteht.
	 * Die Hashmap wird beim Aufruf der Methode selectAll anhand der eingelesenen Objekte neu erstellt.
	 * Die Dateinamen werden in einem Vector-Objekt fetsgehalten und so mit gespeichert.
	 * 
	 * @param hobbyListe
	 * @return true wenn Objekt gespeichert wurde, sonst false
	 */
	public boolean storeHobbyListe(Vector<String> hobbyListe){
		
		System.out.println("STORE DATA");
		
		try{
		  FileOutputStream fos = new FileOutputStream(fileName);
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      oos.writeObject(hobbyListe);
	      oos.close();
	      return true;      
		}
		catch(FileNotFoundException err){
			System.out.println(err);
		}
		catch(IOException err){
			System.out.println(err);
		}
		
		return false;
		
	}
	
	/**
	 * Liefert ein Vector-Objekt mit der Hobby-Liste.
	 * Die Daten werden aus einer Datei gelesen.
	 * @return ein Vectro-Objekt mit der Hobby-Liste
	 */
	public Vector<String> loadHobbyListe(){
		
		System.out.println("LOAD DATA");
		
		try{
		  FileInputStream fis = new FileInputStream(fileName);
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      Vector<String> v =  (Vector<String>) ois.readObject();
	      ois.close();
	      return v;
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
