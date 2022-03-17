import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DayFromNowTest {
    @Test
    public void calculateDateFromNow() {
        LocalDate toDay = LocalDate.of(2020, 1, 1);
        assertEquals(LocalDate.of(2020, 4, 10), DayFromNow.calculateHundredDayFromNow(toDay));
    }
}