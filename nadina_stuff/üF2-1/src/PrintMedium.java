/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

abstract class PrintMedium {

   protected String titel;
   protected String verlag;

    // Constructor
    public PrintMedium(String titel, String verlag){
        this.titel = titel;
        this.verlag = verlag;
    }

    // Constuktor 1 just titel
    public PrintMedium(String titel) {
    }

    // titel
    public String getTitel() {
        return titel;
    }

    public String getVerlag() {
        return verlag;
    }

    public abstract void showInfo();

    public void addTabulator2Text(String text){

    }
 }
