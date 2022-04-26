package org.launchcode.studio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class FloppyTest {
    @Test
    public void testFloppyExtendsDisc(){
        Disc test = new Floppy("test");
        assertTrue(test instanceof Disc);
    }

}