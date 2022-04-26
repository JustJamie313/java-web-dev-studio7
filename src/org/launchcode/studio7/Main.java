package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        Library myLibrary = new Library();
        CD myCD = new CD("First CD");
        myCD.load();
        myCD.spin();
        myCD.write(new Song("First Song","First Song Content", 10));
        myCD.write(new Song("Second Song","Second Song Content", 5));
        myCD.store(myLibrary);
        myCD.eject();

        DVD myDVD = new DVD("First DVD");
        myDVD.load();
        myDVD.spin();
        myDVD.write(new Chapter("Chapter 1","Chapter 1 Content", 17));
        myDVD.write(new Chapter("Chapter 2","Chapter 2 Content", 13));
        myDVD.store(myLibrary);
        myDVD.eject();

        LP myLP = new LP("First LP");
        myLP.load();
        myLP.spin();
        myLP.write(new Song("First LP Song","First LP Song Content", 12));
        myLP.write(new Song("Second LP Song","Second LP Song Content",6));
        myLP.store(myLibrary);
        myLP.eject();

        Floppy myFloppy = new Floppy("First Floppy");
        myFloppy.load();
        myFloppy.spin();
        myFloppy.write(new DataFile("First Data File","First Data File Content",15));
        myFloppy.write(new DataFile("Second Data File","Second Data File Content",7));
        myFloppy.store(myLibrary);
        myFloppy.eject();

        System.out.println(myLibrary);
    }
}
