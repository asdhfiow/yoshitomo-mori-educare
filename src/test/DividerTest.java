package test;

import main.Divider;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DividerTest {

    Divider divider = new Divider();

    @Test
    void testNormalDivision() {
        // 正の数同士の除算
        assertEquals(5.0, divider.divide(10, 2), 0.0001, "10 ÷ 2 は 5.0 のはず");

        // 負の数を含む除算
        assertEquals(-5.0, divider.divide(-10, 2), 0.0001, "-10 ÷ 2 は -5.0 のはず");

        // 少数を含む除算
        assertEquals(2.5, divider.divide(5, 2), 0.0001, "5 ÷ 2 は 2.5 のはず");
    }

     @Test
    void testExceptionDivision() {
        Divider divider = new Divider();
        try {
            divider.divide(5.0, 0.0);
            fail("ゼロ除算で例外が発生するはず");
        } catch (IllegalArgumentException e) {
            assertEquals("ゼロで除算はできません", e.getMessage());
        }
    }
}
