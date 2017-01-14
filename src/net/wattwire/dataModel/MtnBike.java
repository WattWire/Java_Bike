package net.wattwire.dataModel;

/**
 * Created by dave on 1/11/17.
 */
public class MtnBike extends Velo {

    private String dropper_post;

    public MtnBike (int nw, float rimsize, String desc, BikeColor bc, BikeType bt, String dropper_post){

        //* The super method below says, "First construct the human components with these
        //* input variables. Notice we ignore the input var 'desc'
        super(nw,rimsize,"Always an MTB!",bc,bt);

    }

    public void foo(){

        dropper_post = "Yes, we need the dropper post!";

    }

}
