package C3_1;

/**
 Beispiel f�r die Kommmunikation von 2 Klassen �ber Schnittstellen.

 @Author:   bitte Namen erg�nzen
 @Date:     aktuelles Bearbeitungsdatum eintragen
 @Version:  beginnend mit V1.0 die Versionierung nachf�hren
 */
public class LoginChecker implements LoginIF{                                                      //  +----------------------------------+
        // Damit das Zusamenspiel der Klassen funktioniert                                �            LoginIF               �
        // muss diese Klasse bestimmte Regeln erf�llen.                                   +----------------------------------+
        // Darum muss sie das Interface LoginIF implementieren.                           � + ipdate() : booelan             �
        // Dieses Thema werden Sie sp�ter in der Ausbildung                               +----------------------------------+
        // eingehend behandel.                                                                              ^
                                                                  //                   /_\
    //                                                                                                  :  <implements>
    // Deklarieren Sie hier f�r den Benutzername und das Passwort                                       :
    // zwei konstante Werte. Diese Werte dienen als Basis f�r die zu                  +----------------------------------+
    // pr�fenden Eingabewerte am GUI.                                                 �          LoginChecker            �
    // Lesen Sie im Fachbuch nach, wie in Java ein Wert als Konstante                 +----------------------------------+
    // deklariert wird.                                                               � - user : String  {final}         �
    //....do it
  .....
          //                                                                                � .....                            �
          // Deklarieren Sie hier eine Z�hlervaribale f�r die maximal zul�ssigen            +----------------------------------+
          // Fehlversuche.                                                                  � + LoginChecker(gui : LoginGUI)   �
          // Deklarieren Sie ebenso eine Konstante, um den maximalen Wert                   � + update() : boolean             �
          // f�r die Z�hlvariable festzulegen                                               +----------------------------------+
          //....do it
          .....
    //
    // Referenz auf das GUI-Objekt.
    // Dieses Objekt ben�tigen Sie, um die Methoden des GUI-Objekts
    // aufzurufen. Siehe dazu die API der Klasse LoginGUI.
    private LoginGUI gui;
    //
    // Konstruktor der Klasse erh�lt die Referenz auf das GUI-Objekt.
    // Diese Referenz ist abzuspeichern.
    public LoginChecker(LoginGUI gui){
        this.gui = gui;
        // hier muss dem GUI-Objekt die eigene Referenz (this) mitgeteilt
        // werden. Wie das geht, steht in der API der Klasse LoginGUI.
        //....do it
    .....
    }
    //
    // Um die Regeln der Schnittstelle LoginIF zu erf�llen, muss die
    // Methode update() implementiert sein.
    // Lesen Sie in der API der Klasse LoginGUI, welche Bewanntnis dies hat.
    public boolean update(){                                                      //    +--------------------------------------------+
        // Hier m�ssen die Eingaben f�r den Benutzernamen und das Passwort                � update()                                   �
        // gepr�ft werden.                                                                �   +----------------------------------------+
        // Dem GUI-Objekt ist eine entsprechende R�ckmeldung zu geben.                    �   � if (Eingabewert_1 = user)              �
        // Lesen Sie in der API der Klasse LoginGUI, wie die zur Verf�gung                �   �    --+---------------------------------+
        // gestellten Methoden genutzt werden.                                            �   � then � if (Eingabewert_2 = pwd)        �
        //                                                                                �   �      �    --+--------------------------+
        // f�r die PL/1 und Cobol gewohnten Lernenden:                                    �   �      � then � > true                   �
        // eine Entscheidung wird wie folgt angeschrieben:                                �   �      �    --+--------------------------+
        // if ( Bedingung ){                                                              �   �      � else � if (errCount++ > MAXTRY) �
        //    Code f�r zutreffende Bedingung                                              �   �      �      �    --+-------------------+
        // }                                                                              �   �      �      � then � Login abbrechen   �
        // else{                                                                          �   �      �      +------+-------------------+
        //    Code f�r abgewiesene Bedingung                                              �   �      �      � > false                  �
        // }                                                                              �   �    --+------+--------------------------+
        //                                                                                �   � else � if (errCount++ > MAXTRY)        �
        // f�r alle:                                                                      �   �      �    --+--------------------------+
        // Strings in Java d�rfen nicht mit == verglichen werden. Dazu muss                �   �      � then � Login abbrechen          �
        // die Methode equals() genutzt werden.                                           �   �      +------+--------------------------+
        // string1.equals(string2) --> liefert true oder false                            �   �      � > false                         �
        //                                                                                +---+------+---------------------------------+
        //do it
    .....
    }
}
