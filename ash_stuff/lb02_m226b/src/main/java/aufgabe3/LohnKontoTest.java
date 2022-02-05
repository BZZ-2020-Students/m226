package aufgabe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LohnKontoTest {
    Lohnkonto lk;

    @Before
    public void set() {
        lk = new Lohnkonto(500.0f);
    }

    @Test
    public void checkUeberzug() {
        assertEquals(500.0f, lk.getUeberzugBetrag(), 0.0f);
    }

    @Test
    public void checkSaldoPrint() {
        lk.saldo = 300.0f;
        assertEquals(300.0f, lk.aktuellerSaldo(), 0.0f);
    }

    @Test
    public void checkSaldoMitBezug() {
        lk.saldo = 300.0f;
        try {
            lk.beziehen(100.0f);

        } catch (KontoUeberzugEcxeption e) {
            e.printStackTrace();
        }
        assertEquals(200.0f, lk.aktuellerSaldo(), 0.0f);
    }

    @Test
    public void checkSaldoMitMinus() {
        lk.saldo = 300.0f;
        try {
            lk.beziehen(400.0f);

        } catch (KontoUeberzugEcxeption e) {
            e.printStackTrace();
        }
        assertEquals(-100.0f, lk.aktuellerSaldo(), 0.0f);
    }

    @Test
    public void checkSaldoMitMinus800() {
        lk.saldo = 300.0f;
        try{
        lk.beziehen(800.0f);
        }catch(KontoUeberzugEcxeption e){
            e.printStackTrace();
        }
        assertEquals(-500.0f, lk.aktuellerSaldo(), 0.0f);
    }

    @Test
    public void checkSaldoMitMinus801() {
        lk.saldo = 300.0f;
        assertThrows(KontoUeberzugEcxeption.class, () -> {
            lk.beziehen(801.0f);
        });
    }


}
