package org.launchcode.studio7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiscTest {
    Disc testDisc;
    Content testContent;
    Library testLibrary;
    @Before
    public void setUp(){
        testLibrary = new Library();
        testDisc = new CD("testCD");
        testContent = new Song("testSong","testSongContent",10);
    }

    @Test
    public void testDiscImplementsDiscInterface(){
        assertTrue(testDisc.IMPLEMENTED);
    }
    @Test
    public void addContent() {
        assertTrue(testDisc.getContent().isEmpty());
        testDisc.addContent(testContent);
        assertTrue(testDisc.getContent().size() == 1);
    }

    @Test
    public void spin() {
        testDisc.load();
        testDisc.spin();
        assertTrue(testDisc.spinning);
    }

    @Test
    public void store() {
        testDisc.store(testLibrary);
        assertTrue(testLibrary.getDiscLibrary().size() == 1);
    }

    @Test
    public void write() {
        testDisc.write(testContent);
        assertTrue(testDisc.getContent().size() == 1);
    }

    @Test
    public void load() {
        testDisc.load();
        assertTrue(testDisc.loaded);
    }

    @Test
    public void eject() {
        testDisc.eject();
        assertFalse(testDisc.spinning);
        assertFalse(testDisc.loaded);
    }
}