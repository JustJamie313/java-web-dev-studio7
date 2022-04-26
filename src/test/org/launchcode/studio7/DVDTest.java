package org.launchcode.studio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class DVDTest {
    @Test
    public void testDVDExtendsDisc(){
        Disc test = new DVD("test");
        assertTrue(test instanceof Disc);
    }

}