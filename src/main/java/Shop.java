import Instrument.Instrument;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Instrument>stock;

    public Shop(){
        stock = new ArrayList<Instrument>();
    }

    public int getStockSize(){
        return this.stock.size();
    }

    public void addStock(Instrument instrument){
        this.stock.add(instrument);
    }

    public void removeStock(Instrument instrument){
        this.stock.remove(instrument);
    }

}
