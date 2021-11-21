import Instrument.Sax;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxTest {
    Sax sax;
    @Before()
    public void before(){
        sax = new Sax("Brass Family", "Gold", 300, 500, 2);
    }
    @Test
    public void hasType(){
        assertEquals("Brass Family", sax.getType());
    }
    @Test
    public void hasColour(){
        assertEquals("Gold", sax.getColour());
    }
    @Test
    public void hasWholesalePrice(){
        assertEquals(300, sax.getWholesalePrice());
    }
    @Test
    public void hasRetailPrice(){
        assertEquals(500, sax.getRetailPrice());
    }
    @Test
    public void hasReedNumber(){
        assertEquals(2, sax.getReedNumber());
    }

    @Test
    public void canPlay(){
        assertEquals("SAX-AH-MA-FONE", sax.play());
    }


    @Test
    public void canCalculateProfit(){
        assertEquals(200, sax.calculateProfit(sax));
    }

}
