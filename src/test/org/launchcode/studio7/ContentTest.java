package org.launchcode.studio7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContentTest {
    Content test;
    @Before
    public void setUp(){
        test = new Song("test","test",1);
    }
    @Test
    public void testContentImplementsContentInterface(){
        assertTrue(test.IMPLEMENTED);
    }
    @Test
    public void play() {
        String result = test.play();
        String expected = "Now Playing: test\n\t\t\t\ttest";
        assertEquals(expected,result);

    }
}