package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherStringTest {

    MatcherString ob;

    @Before
    public void setUp() throws Exception {
    ob = new MatcherString();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void matcherStringTest()
    {
        String Result = ob.matchTheString("Hii thiis is a hii mess is","is");
        assertEquals("found: 1 : 7 - 9\n" +
                "found: 2 : 10 - 12\n" +
                "found: 3 : 24 - 26\n",Result);
    }
}