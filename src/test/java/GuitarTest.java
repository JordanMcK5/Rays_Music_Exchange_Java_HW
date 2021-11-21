import Instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    @Before()
    public void before(){
        guitar = new Guitar("String Family", "Brown", 100, 200, 6);
    }
    @Test
    public void hasType(){
        assertEquals("String Family", guitar.getType());
    }
    @Test
    public void hasColour(){
        assertEquals("Brown", guitar.getColour());
    }
    @Test
    public void hasWholesalePrice(){
        assertEquals(100, guitar.getWholesalePrice());
    }
    @Test
    public void hasRetailPrice(){
        assertEquals(200, guitar.getRetailPrice());
    }
    @Test
    public void hasStringNumber(){
        assertEquals(6, guitar.getStringNumber());
    }

    @Test
    public void canPlay(){
        assertEquals("RIFFFF", guitar.play());
    }


    @Test
    public void canCalculateProfit(){
        assertEquals(100, guitar.calculateProfit(guitar));
    }

}
