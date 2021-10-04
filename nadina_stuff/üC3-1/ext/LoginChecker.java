/**

   @Author:   Amsler Nadina(shirin197)
   @Date:     31.08.2021
   @Version:  V1.0
*/
public class LoginChecker
        implements LoginIF {

  private final String user = "nadina";
  private final String password = "nadina";

  private int errcounter;
  // Konstanter maximaler Wert für die Zählervariable
  private int maxError = 3;

  // Objekt um Methoden des GUI-Objektes aufzurufen
  private LoginGUI gui;

  // Referenz des GUI-Objekt
  public LoginChecker(LoginGUI gui) {
    this.gui = gui;
    // eigene Referenz this
    gui.setLoginChecker(this);
  }


  // update()
  public boolean update() {
    // equals Methode beide zusammen
    if (gui.getUser().equals(user) && gui.getPassword().equals(password)) {
      return true;
    } else if (maxError == 3) {
      return false;
    } else {
      return false;
    }
  }
  /* Zweite möglichkeit
  -------------------------------------------
  * public boolean update(){
  * if (gui.getUser.equals(user){
  *   if(guit.getPasswort.equals)passwort){
  *   return true;
  * } else{
  *     if (errcounter++  > maxError){
  *     gui.loginAbort();
  *     return false;
  *  }
  * } // ende von if
  * else {
  *   if ( errcounter++ > macError){
  *     gui.loginAbort();
  *     return false;
  *     }
  *   }
  * }
  * */
}

