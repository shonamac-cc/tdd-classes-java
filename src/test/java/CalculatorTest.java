
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(8, 2, 30.0, 7.0);
    }

    @Test
    public void addNumber(){
        assertEquals(10, calculator.addNumber());
    }

    @Test
    public void subtractNumber(){
        assertEquals(6, calculator.subtractNumber());
    }

    @Test
    public void multiplyNumber(){
        assertEquals(16, calculator.multiplyNumber());
    }

    @Test
    public void divideNumber(){
        assertEquals(4.28, calculator.divideNumber(), 0.01);
    }
}
