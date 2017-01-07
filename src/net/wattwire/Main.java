package net.wattwire;

import net.wattwire.dataModel.BikeColor;
import net.wattwire.dataModel.BikeType;
import net.wattwire.dataModel.Velo;

import java.util.ArrayList;
import java.util.List;

import static net.wattwire.BikeUtils.stro;

public class Main {

    public static void main(String[] args) {

        stro(1,"Hello Bike Bitches!!!");

        //*** Note that List is an Interface; and ArrayList is a Class that implements it
        // also called the "Concrete Implementation of the Class"
        List<Velo> myBikes = new ArrayList<>();

        myBikes.add(new Velo(2,29.5f,"Cracked Niner", BikeColor.WHITE, BikeType.MTN));

    }
}
