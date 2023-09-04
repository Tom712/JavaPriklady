package zadania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ObdlznikTest {

    @Test
    void obvodTest() {
        assertEquals(11.4, Obdlznik.obvod(2.5, 3.2));
    }

    @Test
    void obsahTest() {
        assertEquals(8.0, Obdlznik.obsah(2.5, 3.2));
    }

}