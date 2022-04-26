package org.launchcode.studio7;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SongTest {
    @Test
    public void testSongExtendsContent(){
        Song testSong = new Song("Test Song","Test Song Content", 10);
        assertTrue(testSong.getName().equals("Test Song"));
        assertTrue(testSong.getContent().equals("Test Song Content"));
    }
}
