package test;

import main.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // 足し算のテスト
    @Test
    void testAddPositiveNumbers() {
        int result = calculator.add(3, 5);
        assertEquals(8, result, "正の数同士の足し算に失敗");
    }

    @Test
    void testAddWithNegativeNumbers() {
        int result = calculator.add(-3, 5);
        assertEquals(2, result, "負の数を含む足し算に失敗");
    }

    @Test
    void testAddWithZero() {
        int result = calculator.add(0, 5);
        assertEquals(5, result, "ゼロを含む足し算に失敗");
    }

    // 引き算のテスト
    @Test
    void testSubtractPositiveNumbers() {
        int result = calculator.subtract(8, 5);
        assertEquals(3, result, "正の数同士の引き算に失敗");
    }

    @Test
    void testSubtractWithNegativeNumbers() {
        int result = calculator.subtract(-3, 5);
        assertEquals(-8, result, "負の数を含む引き算に失敗");
    }

    @Test
    void testSubtractWithZero() {
        int result = calculator.subtract(5, 0);
        assertEquals(5, result, "ゼロを含む引き算に失敗");
    }
}
