package net.wattwire;

import net.wattwire.dataModel.BikeColor;
import net.wattwire.dataModel.BikeType;
import net.wattwire.dataModel.Velo;

import java.util.ArrayList;
import java.util.List;

import static net.wattwire.BikeUtils.pstr;

/**
 * Created by dave on 1/7/17.
 */
public class BikeTesting {


    public static void loadBikes() {
        BikeColor blue_bike = BikeColor.BLUE;

        //*** Note that List is an Interface; and ArrayList is a Class that implements it
        // also called the "Concrete Implementation of the Class"
        List<Velo> myBikes = new ArrayList<Velo>();

        Velo jekyl = new Velo(
                2,
                26f,
                "The Jekyl",
                BikeColor.BLACK,  // this an enum
                BikeType.MTN),    // this an enum

                tbike,
                zurich;    // this another variable declared, but not assigned yet

        zurich = new Velo(2,29f,"Zurich Roadster", blue_bike, BikeType.ROAD);

        myBikes.add(new Velo(2,29.5f,"Cracked Niner", BikeColor.WHITE, BikeType.MTN));
        myBikes.add(jekyl);
        myBikes.add(zurich);

        //**** At this point we should have 3 bikes loaded into myBikes.

        pstr(2,"Hello Bike Bitches!!!\n");

        tbike = myBikes.get(1);

        pstr(2,myBikes.get(1).toString());

        pstr(3, "The end.");

    }




}
