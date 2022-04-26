package org.launchcode.studio7;

import java.util.ArrayList;

public class Library {
    ArrayList<Disc> discLibrary = new ArrayList<>();

    public ArrayList<Disc> getDiscLibrary() {
        return discLibrary;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("My Library");
        for(Disc disc:discLibrary){
            output.append("\n\t").append(disc.getName());
            for(Content content: disc.getContent()){
                output.append("\n\t\t").append(content.getName());
                output.append("\n\t\t\t").append(content.play());
            }
        }
        return output.toString();
    }
}
