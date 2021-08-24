package examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {
    private Airplane plane;
    private static final String[] defaultLoad = new String[] {"container", "car"};

    @BeforeEach
    void setUp() {
        plane = new Airplane();
        plane.setLoad(defaultLoad);
        plane.setTeamSize((byte) 6);
        plane.setWeight(50000);
    }

    @Test
    void setWeight() throws NoSuchFieldException, IllegalAccessException {
        plane.setWeight(10);

        final Field field = plane.getClass().getDeclaredField("weight");
        field.setAccessible(true);

        assertEquals(field.get(plane), 10d);
    }

    @Test
    void getWeight() {
        assertEquals(plane.getWeight(), 50000);
    }

    @Test
    void getLoad() {
        assertEquals(plane.getLoad(), defaultLoad);
    }

    @Test
    void setLoad() throws NoSuchFieldException, IllegalAccessException {
        String[] newLoad = new String[] {"Computers", "Food"};
        plane.setLoad(newLoad);

        final Field field = plane.getClass().getDeclaredField("load");
        field.setAccessible(true);

        assertEquals(field.get(plane), newLoad);
    }

    @Test
    void getTeamSize() {
        assertEquals(plane.getTeamSize(), ((byte) 6));
    }

    @Test
    void setTeamSize() throws NoSuchFieldException, IllegalAccessException {
        plane.setTeamSize((byte) 5);

        final Field field = plane.getClass().getDeclaredField("teamSize");
        field.setAccessible(true);

        assertEquals(field.get(plane), ((byte) 5));
    }

    @Test
    void testToString() {
        assertEquals(plane.toString(), "Airplane{" +
                "weight=" + 50000d +
                ", load=" + Arrays.toString(defaultLoad) +
                ", teamSize=" + 6 +
                '}');
    }
}