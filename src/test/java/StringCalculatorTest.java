import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    @Test
    public void addTest_1() {
        assertThrows(IllegalArgumentException.class, () -> StringCalculator.add("-1,100"));
    }

    @Test
    public void addTest_2() {
        assertEquals(3, StringCalculator.add("1,1000,2"));
    }
}
