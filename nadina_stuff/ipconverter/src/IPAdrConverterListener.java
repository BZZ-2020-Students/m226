/**
 * Schnittstelle der Hauptklasse zu den Listener.
 * Über die Methode update wird einem Listener eine Änderung der Daten signalisiert.
 * 
 * @author  B163AAL
 * @version 1.0
 * @date    22.10.2016
 *
 */
public interface IPAdrConverterListener {

	/**
	 * meldet einem registrierten Listener eine Änderung der Datenwerte.
	 */
	public void update();
}
