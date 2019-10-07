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
        bottle.drinkWater();
        bottle.drinkWater();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        bottle.emptyBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }
}
