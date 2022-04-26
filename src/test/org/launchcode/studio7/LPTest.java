package org.launchcode.studio7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LPTest {
    @Test
    public void testLPExtendsDisc(){
        Disc testDisc = new LP("testLP");
        assertTrue(testDisc instanceof Disc);
    }

}