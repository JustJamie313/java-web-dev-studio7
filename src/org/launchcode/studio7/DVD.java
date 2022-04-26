package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends Disc{
    public static final int MAX_SPIN_RATE = 1600;
    public static final int MIN_SPIN_RATE = 570;

    public DVD(String aName){
        super(aName, MAX_SPIN_RATE, MIN_SPIN_RATE);
    }
    public DVD(String aName, ArrayList<Content> aContent) {super(aName, aContent, MAX_SPIN_RATE, MIN_SPIN_RATE);}
}
