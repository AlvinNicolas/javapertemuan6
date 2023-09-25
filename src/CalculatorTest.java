import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        // Menjalankan metode add dengan input 2 dan 3
        int result = calculator.add(2, 3);

        // Memeriksa apakah hasilnya sama dengan 5
        assertEquals(5, result);
    }
}
