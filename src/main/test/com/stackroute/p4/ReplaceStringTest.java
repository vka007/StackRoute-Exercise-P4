package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest {

    ReplaceString ob;

    @Before
    public void setUp() throws Exception {
    ob = new ReplaceString();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void replaceChars()
    {
        String input = "daily dry";
        String Result = ob.replaceGame(input);
        assertEquals("faity fry",Result);
    }

    @Test
    public void replaceCharsAgain()
    {
        String input = "dlymdr dare";
        String Result = ob.replaceGame(input);
        assertEquals("ftymfr fare",Result);
    }

}