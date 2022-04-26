package org.launchcode.studio7;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataFileTest {
    @Test
    public void testDataFileExtendsContent(){
        Content test = new DataFile("test","test",1);
        assertTrue(test instanceof Content);
    }

}