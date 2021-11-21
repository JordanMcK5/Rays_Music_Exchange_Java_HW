import Instrument.Guitar;
import Instrument.Sax;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Guitar guitar;
    Sax sax;
    Shop shop;

    @Before
    public void before(){
        guitar = new Guitar("String Family", "Brown", 100, 200, 6);
        sax = new Sax("Brass Family", "Gold", 300, 300, 2);
        shop = new Shop();
    }

    @Test
    public void shopExists() {
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(sax);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(1, shop.getStockSize());

    }
}
