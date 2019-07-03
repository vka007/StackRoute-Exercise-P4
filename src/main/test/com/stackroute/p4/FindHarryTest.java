package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {

    FindHarry ob;

    @Before
    public void setUp() throws Exception {
    ob = new FindHarry();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void findHarryTrue()
    {
        boolean bool = ob.isHarryhere("This is Harry here.");
        assertEquals(true,bool);
    }

    @Test
    public void findHarryFalse()
    {
        boolean bool = ob.isHarryhere("This is Akash here.");
        assertEquals(false,bool);
    }


}