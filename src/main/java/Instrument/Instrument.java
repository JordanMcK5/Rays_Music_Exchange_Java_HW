package Instrument;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String type;
    private String colour;
    private int wholesalePrice;
    private int retailPrice;

    public Instrument(String type, String colour, int wholesalePrice, int retailPrice) {
        this.type = type;
        this.colour = colour;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int calculateProfit(Instrument instrument){
        int profit = instrument.retailPrice - instrument.wholesalePrice;
        return profit;
    }
}

