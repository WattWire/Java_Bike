package net.wattwire;

/**
 * Created by dave on 1/7/17.
 */
public class BikeUtils {

    // **** Print String Out, preceeded by nl line feeds:
    public static void pstr(int nl, String s) {

        for (; nl>0; --nl) {s = "\n"+s;}
        System.out.print(s);

    }



}
