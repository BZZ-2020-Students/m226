package examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankKontoTest {

    @Test
    void printInfo() {
        BankKonto konotoLeer, kontoX, kontoMoritz;
        konotoLeer = new BankKonto();
        kontoX = new BankKonto(1000, 5);
        kontoMoritz = new BankKonto(500, 2.5f, 250, "Moritz");

        konotoLeer.printInfo();
        kontoX.printInfo();
        kontoMoritz.printInfo();
    }
}