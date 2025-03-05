import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostCalculatorTest {
    private static CostCalculator costCalculator;

    @BeforeAll
    static void setUp() {
        costCalculator = new CostCalculator();
    }

    @Test
    void testCostCalculation() {
        costCalculator.setDistance(100);
        costCalculator.setFuelPrice(1.5);
        assertEquals(7.5, costCalculator.cost());
    }

    @Test
    void testFuelNeeded() {
        costCalculator.setDistance(100);
        assertEquals(5, costCalculator.fuelNeeded());
    }

    @Test
    void display() {
        costCalculator.setDistance(100);
        costCalculator.setFuelPrice(1.5);
        costCalculator.display();
    }
}