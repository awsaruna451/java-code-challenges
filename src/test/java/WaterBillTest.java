import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterBillTest {
    @Test
    public void calculateWaterBill() {
        assertEquals(22.74, WaterBill.calculateWaterBill(1800.00));
        assertEquals(22.74, WaterBill.calculateWaterBill(2244.00));
        assertEquals(18.84, WaterBill.calculateWaterBill(1200.00));
    }

}