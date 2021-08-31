/**
 * Beispiel für die Kommmunikation von 2 Klassen über Schnittstellen.
 *
 * @Author: bitte Namen ergänzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachführen
 */
public class LoginChecker                                                       //  +----------------------------------+
        // Damit das Zusamenspiel der Klassen funktioniert                                ¦            LoginIF               ¦
        // muss diese Klasse bestimmte Regeln erfüllen.                                   +----------------------------------+
        // Darum muss sie das Interface LoginIF implementieren.                           ¦ + ipdate() : booelan             ¦
        // Dieses Thema werden Sie später in der Ausbildung                               +----------------------------------+
        // eingehend behandel.                                                                              ^
        implements LoginIF {                                                             //                   /_\
    //                                                                                                  :  <implements>
    // Deklarieren Sie hier für den Benutzername und das Passwort                                       :
    // zwei konstante Werte. Diese Werte dienen als Basis für die zu                  +----------------------------------+
    // prüfenden Eingabewerte am GUI.                                                 ¦          LoginChecker            ¦
    // Lesen Sie im Fachbuch nach, wie in Java ein Wert als Konstante                 +----------------------------------+
    // deklariert wird.                                                               ¦ - user : String  {final}         ¦
    //....do it
    private final String user = "mag";
    private final String pwd = "1234";
    //                                                                                ¦ .....                            ¦
    // Deklarieren Sie hier eine Zählervaribale für die maximal zulässigen            +----------------------------------+
    // Fehlversuche.                                                                  ¦ + LoginChecker(gui : LoginGUI)   ¦
    // Deklarieren Sie ebenso eine Konstante, um den maximalen Wert                   ¦ + update() : boolean             ¦
    // für die Zählvariable festzulegen                                               +----------------------------------+
    //....do it
    private int count = 0;
    private final int countMax = 3;
    //
    // Referenz auf das GUI-Objekt.
    // Dieses Objekt benötigen Sie, um die Methoden des GUI-Objekts
    // aufzurufen. Siehe dazu die API der Klasse LoginGUI.
    private LoginGUI gui;

    //
    // Konstruktor der Klasse erhält die Referenz auf das GUI-Objekt.
    // Diese Referenz ist abzuspeichern.
    public LoginChecker(LoginGUI gui) {
        this.gui = gui;
        // hier muss dem GUI-Objekt die eigene Referenz (this) mitgeteilt
        // werden. Wie das geht, steht in der API der Klasse LoginGUI.
        //....do it
        gui.setLoginChecker(this);
    }

    //
    // Um die Regeln der Schnittstelle LoginIF zu erfüllen, muss die
    // Methode update() implementiert sein.
    // Lesen Sie in der API der Klasse LoginGUI, welche Bewanntnis dies hat.
    public boolean update() {                                                      //    +--------------------------------------------+
        // Hier müssen die Eingaben für den Benutzernamen und das Passwort                ¦ update()                                   ¦
        // geprüft werden.                                                                ¦   +----------------------------------------+
        // Dem GUI-Objekt ist eine entsprechende Rückmeldung zu geben.                    ¦   ¦ if (Eingabewert_1 = user)              ¦
        // Lesen Sie in der API der Klasse LoginGUI, wie die zur Verfügung                ¦   ¦    --+---------------------------------+
        // gestellten Methoden genutzt werden.                                            ¦   ¦ then ¦ if (Eingabewert_2 = pwd)        ¦
        //                                                                                ¦   ¦      ¦    --+--------------------------+
        // für die PL/1 und Cobol gewohnten Lernenden:                                    ¦   ¦      ¦ then ¦ > true                   ¦
        // eine Entscheidung wird wie folgt angeschrieben:                                ¦   ¦      ¦    --+--------------------------+
        // if ( Bedingung ){                                                              ¦   ¦      ¦ else ¦ if (errCount++ > MAXTRY) ¦
        //    Code für zutreffende Bedingung                                              ¦   ¦      ¦      ¦    --+-------------------+
        // }                                                                              ¦   ¦      ¦      ¦ then ¦ Login abbrechen   ¦
        // else{                                                                          ¦   ¦      ¦      +------+-------------------+
        //    Code für abgewiesene Bedingung                                              ¦   ¦      ¦      ¦ > false                  ¦
        // }                                                                              ¦   ¦    --+------+--------------------------+
        //                                                                                ¦   ¦ else ¦ if (errCount++ > MAXTRY)        ¦
        // für alle:                                                                      ¦   ¦      ¦    --+--------------------------+
        // Strings in Java dürfen nicht mit == verglichen werden. Dazu muss                ¦   ¦      ¦ then ¦ Login abbrechen          ¦
        // die Methode equals() genutzt werden.                                           ¦   ¦      +------+--------------------------+
        // string1.equals(string2) --> liefert true oder false                            ¦   ¦      ¦ > false                         ¦
        //                                                                                +---+------+---------------------------------+
        //do it
        if (user.equals(gui.getUserName())) {
            if (pwd.equals(gui.getPwd())) {
                return true;
            } else if (count++ >= countMax) {
                gui.loginAbort();
                count++;
                return false;
            }
        } else if (count++ >= countMax) {
            gui.loginAbort();
            return false;
        }
        return false;
    }
}
