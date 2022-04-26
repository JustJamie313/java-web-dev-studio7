package org.launchcode.studio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class CDTest {
    @Test
    public void testCDExtendsDisc(){
        Disc testDisc = new CD("test");
        assertTrue(testDisc instanceof Disc);
    }
}