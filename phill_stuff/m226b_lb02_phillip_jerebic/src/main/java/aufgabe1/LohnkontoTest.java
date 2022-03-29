package aufgabe1;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;



public class LohnkontoTest {
    private static Lohnkonto lk;

    @BeforeClass
    public static void setup() {
        lk = new Lohnkonto(5300.0f);
    }

    @Test
    public void testNr1() {

        assertEquals(500.0, lk.getUeberzugBetrag(),0);
    }

    @Test
    public void testNr2() {
        lk.saldo = 300.0f;
        assertEquals(300.0f,lk.aktuellerSaldo(),0);
    }


    @Test
    public void testNr3() {
        lk.saldo = 300.0f;
        try {
            lk.beziehen(100.0f);
        } catch (KontoUeberzugEcxeption e) {
            e.printStackTrace();
        }
        assertEquals(200.0f,lk.aktuellerSaldo(),0);    }

    @Test
    public void testNr4() {
        lk.saldo = 300.0f;
        try {
            lk.beziehen(400.0f);
        } catch (KontoUeberzugEcxeption e) {
            e.printStackTrace();
        }
        assertEquals(-100.0f,lk.aktuellerSaldo(),0);    }

    @Test
    public void testNr5() {
        lk.saldo = 300.0f;
        try {
            lk.beziehen(800.0f);
        } catch (KontoUeberzugEcxeption e) {
            e.printStackTrace();
        }
        assertEquals(-500.0f,lk.aktuellerSaldo(),0);    }

    @Test
    public void testNr6() {
        lk.saldo = 300.0f;

        assertThrows(KontoUeberzugEcxeption.class, () -> lk.beziehen(801.0f));
    }
}
