package Instrument;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Sax extends Instrument implements IPlay, ISell {

    private int reedNumber;

    public Sax(String type, String colour, int wholesalePrice, int retailPrice, int reedNumber) {
        super(type, colour, wholesalePrice, retailPrice);
        this.reedNumber = reedNumber;
    }

    public int getReedNumber() {
        return reedNumber;
    }

    @Override
    public String play() {
        return null;
    }
}
