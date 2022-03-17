import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    public void even_true() {
        assertTrue(EvenOrOdd.checkEven(2));
    }
}