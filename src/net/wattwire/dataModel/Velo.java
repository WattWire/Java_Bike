package net.wattwire.dataModel;

/**
 * Created by dave on 1/6/17.
 */
public class Velo {

    private int nWheels;
    private float rimSize;
    private String catDesc;
    private BikeColor color;
    private BikeType btype;

    Velo (int nWheels, float rimSize, String catDesc,BikeColor color, BikeType btype)
    {
        this.nWheels = nWheels;
        this.rimSize = rimSize;
        this.catDesc = catDesc;
        this.color = color;
        this.btype = btype;


    }




}
