import Behaviours.ISell;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Instrument>stock;

    public Shop(){
        stock = new ArrayList<Instrument>();
    }

    public void addStock(Instrument instrument){
        this.stock.add(instrument);
    }

    public void removeStock(Instrument instrument){
        this.stock.remove(instrument);
    }

}
