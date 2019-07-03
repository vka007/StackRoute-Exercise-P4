package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString ob;

    @Before
    public void setUp() throws Exception {
    ob = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void transposeWords()
    {
        String Result = ob.transposeWord("Slack is our common communication channel");
        assertEquals("kcalS si ruo nommoc noitacinummoc lennahc",Result);
    }

    @Test
    public void transposeWordsAgain()
    {
        String Result = ob.transposeWord("Slack is our 3 of 4r common communication channel");
        assertEquals("kcalS si ruo 3 fo r4 nommoc noitacinummoc lennahc",Result);
    }
}