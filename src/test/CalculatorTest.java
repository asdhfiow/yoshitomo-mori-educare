package test;

import main.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // 足し算のテスト
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3は５のはず");
        assertEquals(4, calculator.add(-1, 5), "-1 + 5は４のはず");
        assertEquals(4, calculator.add(0, 4) ,"0 + 4は４のはず");
    }

    //引き算のテスト
    @Test
    void testSubstract(){
        assertEquals(2, calculator.subtract(5, -3), "5 -(-3)は８のはず");
        assertEquals(1, calculator.subtract(-1, -2), "-1-(-3)は２のはず");
        assertEquals(4, calculator.subtract(4, -0), "4-(-0)は４のはず");
    }
}
