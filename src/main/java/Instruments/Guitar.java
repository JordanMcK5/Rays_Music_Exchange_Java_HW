package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int stringNumber;

    public Guitar(String type, String colour, int wholesalePrice, int retailPrice, int stringNumber) {
        super(type, colour, wholesalePrice, retailPrice);
        this.stringNumber = stringNumber;
    }


    public int getStringNumber() {
        return stringNumber;
    }

    @Override
    public String play() {
        return null;
    }

    @Override
    public int calculateMarkup() {
        return 0;
    }
}
