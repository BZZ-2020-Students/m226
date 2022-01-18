import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SpielerMethodenTest {
  // Deklaration einer Referenzvariable für die Nutzung in den einzelnen Testfällen
  public static Spieler spieler;
  //String name;

  @Before
  //gültiges Objekt für die Test erzeugen
  public void setUp() {

    spieler = new Spieler("Muster", "Max", 33, true);
  }


  public void add() {
  }

  // Testfall 7
  @Test
  public void test07() {
    try {
      spieler.setName("Peter");
      System.out.println(spieler.getName());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Testfall 8
  @Test
  public void test08() {
    try {
      spieler.setName(" ");
      System.out.println(spieler.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Testfall 9
  @Test
  public void test09() {
    try {
      spieler.setName(null);
      System.out.println(spieler.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Testfall 10
  @Test
  public void test10() {
    try {
      spieler.setIstCaptain(true);
      System.out.println(spieler.getIstCaptain());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  // Testfall 11
  @Test
  public void test011() {
    try {
      spieler.getName();
      spieler.getVorname();
      System.out.println(spieler.getVorname());
      System.out.println(spieler.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }





}
