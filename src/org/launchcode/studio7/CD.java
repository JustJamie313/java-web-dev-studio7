package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends Disc{
    public static final int MAX_SPIN_RATE = 500;
    public static final int MIN_SPIN_RATE = 200;

    public CD(String name){
        super(name, MAX_SPIN_RATE, MIN_SPIN_RATE);
    }
    public CD(String name, ArrayList<Content> content) {
        super(name, content, MAX_SPIN_RATE, MIN_SPIN_RATE);
    }

}
