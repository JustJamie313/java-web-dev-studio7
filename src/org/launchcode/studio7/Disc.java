package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class Disc implements DiscInterface{
    private static int maxSpinRate;
    private static int minSpinRate;
    private String name;
    private ArrayList<Content> content = new ArrayList<>();
    boolean loaded;
    boolean spinning;

    public Disc(String aName, int aMaxSpinRate, int aMinSpinRate){
        this.name = aName;
        this.maxSpinRate = aMaxSpinRate;
        this.minSpinRate = aMinSpinRate;
    }
    public Disc(String aName, ArrayList<Content> aContent, int aMaxSpinRage, int aMinSpinRate) {
        this.name = aName;
        this.content = aContent;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Content> getContent() {
        return content;
    }

    public static int getMaxSpinRate() {
        return maxSpinRate;
    }

    public static int getMinSpinRate() {
        return minSpinRate;
    }

    public void addContent(Content aContent){
        this.content.add((aContent));
    }
    @Override
    public void spin(){
        if(loaded){
            this.spinning = true;
            System.out.println(getName()+" is spinning between "+getMinSpinRate()+" and "+getMaxSpinRate()+" rpm");
        } else {
            System.out.println("Disc failed to spin: Not Loaded");
        }
    }
    @Override
    public void store(Library aLibrary){
        aLibrary.discLibrary.add(this);
        System.out.println(getName()+" added to "+aLibrary);
    }
    @Override
    public void write(Content aContent){
        addContent(aContent);
        System.out.println(aContent.getName()+" was written to "+getName());
    }
    @Override
    public void read(){
        if(spinning){
            System.out.println(getName());
            for(Content discContent:getContent()){
                System.out.println("\t"+discContent.getName() + ","+discContent.getDuration() + "s");
            }
        } else {
            System.out.println("Disc failed to read: Not Spinning");
        }
    }
    @Override
    public void load(){
        this.loaded = true;
        System.out.println(getName()+" loaded");
    }
    @Override
    public void eject(){
        this.spinning = false;
        this.loaded = false;
        System.out.println("Ejecting: "+getName());
    }
}
