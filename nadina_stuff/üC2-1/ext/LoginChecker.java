/**

   @Author:   Amsler Nadina(shirin197)
   @Date:     31.08.2021
   @Version:  V1.0
*/
public class LoginChecker
        implements LoginIF {

  private final String user = "nadina";
  private final String password = "nadina";

  private int counter;
  // Konstanter maximaler Wert für die Zählervariable
  private int maxError = 3;

  // Objekt um Methoden des GUI-Objektes aufzurufen
  private LoginGUI gui;

  // Referenz des GUI-Objekt
  public LoginChecker(LoginGUI gui) {
    // eigene Referenz this
    this.gui = gui;
  }


  // update()
  public boolean update() {
    // equals Methode
    if (gui.getUser().equals(user) && gui.getPassword().equals(password)) {
      return true;
    } else if (maxError == 3) {
      return false;
    } else {
      return false;
    }
  }
}