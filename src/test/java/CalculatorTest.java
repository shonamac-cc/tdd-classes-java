
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addNumber(){
        assertEquals(10, calculator.addNumber(8, 2));
    }

    @Test
    public void subtractNumber(){
        assertEquals(6, calculator.subtractNumber(8, 2));
    }

    @Test
    public void multiplyNumber(){
        assertEquals(16, calculator.multiplyNumber(8, 2));
    }

    @Test
    public void divideNumber(){
        assertEquals(4.28, calculator.divideNumber(30.0, 7.0), 0.01);
    }
}
