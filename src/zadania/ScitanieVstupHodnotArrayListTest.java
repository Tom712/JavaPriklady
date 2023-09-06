package zadania;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScitanieVstupHodnotArrayListTest {

    @Test
    void zaokruhlenieTest() {
        assertEquals(54605.95, ScitanieVstupHodnotArrayList.zaokruhlenie(54605.94645));
    }

}
