package org.launchcode.studio7;

import java.util.ArrayList;

public class Floppy extends Disc{
    public static final int MAX_SPIN_RATE = 360;
    public static final int MIN_SPIN_RATE = 300;
    public Floppy(String name){
        super(name, MAX_SPIN_RATE, MIN_SPIN_RATE);
    }
    public Floppy(String name, ArrayList<Content> content) {
        super(name, content, MAX_SPIN_RATE, MIN_SPIN_RATE);
    }
}
