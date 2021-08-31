package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    private final Singleton a = Singleton.getInstance("a");
    private final Singleton b = Singleton.getInstance("b");

    @Test
    void getInstance() {
        assertEquals(a, b);
    }

    @Test
    void getComment() {
        assertEquals(a.getComment(), b.getComment());
    }
}