import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void drinkWater(){
        assertEquals(90, bottle.drinkWater());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, bottle.fillBottle());
    }
}
