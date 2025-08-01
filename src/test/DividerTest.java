package test;

import main.Divider;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DividerTest {

    Divider divider = new Divider();

    // 正の数同士の除算
    @Test
    void testDividePositiveNumbers() {
        double result = divider.divide(10, 2);
        assertEquals(5.0, result, 1e-9, "10 ÷ 2 should be 5.0");
    }

    // 負の数を含む除算
    @Test
    void testDivideWithNegativeNumber() {
        double result = divider.divide(-10, 2);
        assertEquals(-5.0, result, 1e-9, "-10 ÷ 2 should be -5.0");

        result = divider.divide(10, -2);
        assertEquals(-5.0, result, 1e-9, "10 ÷ -2 should be -5.0");

        result = divider.divide(-10, -2);
        assertEquals(5.0, result, 1e-9, "-10 ÷ -2 should be 5.0");
    }

    // 少数を含む除算
    @Test
    void testDivideWithDecimalNumbers() {
        double result = divider.divide(5.5, 2.2);
        assertEquals(2.5, result, 1e-9, "5.5 ÷ 2.2 should be 2.5");
    }

    // ゼロによる除算（例外発生確認）
    @Test
    void testDivideByZero() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            divider.divide(10, 0);
        }, "Division by zero should throw IllegalArgumentException");

        assertEquals("Divider cannot be zero.", e.getMessage(), "Exception message mismatch");
    }
}
