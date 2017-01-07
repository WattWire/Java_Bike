package net.wattwire.dataModel;

/**
 * Created by dave on 1/6/17.
 */

public enum BikeColor {

    YELLOW("Yellow", 0xFFFF00),
    RED("Red",0xFF0000),
    BLACK("Black", 0x000000),
    WHITE("White", 0xFFFFFF);

    String colorName;
    long colorVal;

    // *** Constructor:

    BikeColor (String colorName, long colorVal) {

        this.colorName = colorName;
        this.colorVal = colorVal;

    }

}
