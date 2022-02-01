import java.util.Vector;

public class ArrayDemo{
  
  public int MAX_STELLEN = 5;   /* später für JUNit-Test benötigt */

  /* typ: Vector, Datentyp: Float, Name der Collection : 'noten'
  * Der Typ, Datentype und Collection Name kann sich je nach anforderung ändern,
  * */
  private Vector<Float> noten;
  
  public ArrayDemo(){
    noten = new Vector<>(MAX_STELLEN);
  }
  
  /*
  Die hier programmierten Methoden "schützen" den Array nicht
  vor falscher Indexierung. Somit ist die fehlerfreie Ausführung
  des Programms nicht gewährleitet.
  
  Durch den Einbau von Exceptionhanlder soll die Software wieder
  in einen betriebssicheren Zustand gebracht werden.
  
  */

  
  public int getMaxGroesse(){
    return MAX_STELLEN;
  }
  
  public void getAnzahlElemente(){
    noten.size();
  }

  public Float getNote(int index){
        return noten.get(index);
  }
  
  public void removeWert(int index){
    noten.remove(index);
  }
  
  public static void main(String[] args){
    ArrayDemo demo = new ArrayDemo();
    try {
      demo.addWert(4.5f);
      demo.addWert(5.0f);
      demo.addWert(3.5f);
      demo.addWert(4.0f);
      demo.addWert(5.0f);
      demo.addWert(3.5f);
    }catch (NotenbereichException e){
      System.err.println("Error, der Wert liegt ausserhalb des Erwünschten Bereiches :  " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException error) {
      System.out.println("Fehler 2: Zu viele Werte eingegeben\n");
    }

    demo.print();
    //
    System.out.println("\n\nLösche Wert an 2. Stelle");
    demo.removeWert(1); // index beginnt bei 0
    demo.print();
    //
    try {
      System.out.print("\n\n8. Note = ");
      System.out.println(demo.getNote(8));
    }catch (Exception e){
      System.err.println(e.getMessage());
    }
    //
    demo.print();
    //demo.getAnzahlElemente();
   // System.out.println("\n\nArray umfasst zur Zeit "+demo.getAnzahlElemente()+" Elemente");
    System.out.println("Wert an 3. Stelle ist "+demo.getNote(2));
    System.out.println("Grösse des Array ist "+demo.getMaxGroesse());
    System.out.println("=====================================================");
    demo.print();


  }

  public void addWert(float note) throws NotenbereichException{
    if(note < 1.0 || note > 6.0){
      throw new NotenbereichException();
    } else {
      noten.add(note);
    }
  }

  public void print(){
    for(Float aFloat : noten);
    System.out.println(noten);
  }
}