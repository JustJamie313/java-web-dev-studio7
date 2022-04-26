package org.launchcode.studio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChapterTest {
    @Test
    public void testChapterExtendsContent(){
        Content test = new Chapter("test","test",1);
        assertTrue(test instanceof Content);
    }
}