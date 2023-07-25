package test.test.com.Udemy.unitTesting;

import com.Udemy.unitTesting.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour(){
        var calculator = new Calculator();
        int result = calculator.add(2,2);
        assertEquals(4, result);
    }

}