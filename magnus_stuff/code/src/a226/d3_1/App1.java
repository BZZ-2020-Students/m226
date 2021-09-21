package a226.d3_1;

/**
   Beispiel für die Instanzierung von Klassen, die eine 
   "einseitige" Beziehung pflegen.
   (Objekt A kennt Objekt B aber nicht umgekehrt)
   
   @Author:   Magnus Goetz
   @Date:     14.09.2021
   @Version:  V1.0
*/
public class App1{
  
  public static void main(String[] args){
    
    Haus haus;
    HausBesitzer besitzer;
    
    // gemäss Sequenzdiagramm die Instanzierung implementieren
    // ...do it
    haus = new Haus();

    besitzer = new HausBesitzer(haus);

    System.out.println(besitzer);


  }
  
}