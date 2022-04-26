package org.launchcode.studio7;

import java.util.ArrayList;

public class LP extends Disc{
    public static final int MAX_SPIN_RATE = 78;
    public static final int MIN_SPIN_RATE = 33;
    public LP(String name){
        super(name, MAX_SPIN_RATE, MIN_SPIN_RATE);
    }
    public LP(String name, ArrayList<Content> content) {
        super(name, content, MAX_SPIN_RATE, MIN_SPIN_RATE);
    }
}
