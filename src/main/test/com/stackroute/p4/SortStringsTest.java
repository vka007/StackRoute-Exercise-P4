package com.stackroute.p4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringsTest {

    SortStrings ob;

    @Before
    public void setUp() throws Exception {
    ob = new SortStrings();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void sortParagraph()
    {
        String Result = ob.sortWords("Slack is our common communication channel. It's very important for you all to be online all the time on slack. Kindly update your profile, Phone number, and if notification is snoozed then remove it immediate. Thanks!");
        assertEquals("all all and be channel. common communication for if immediate. important is is it It's Kindly notification number, on online our Phone profile, remove Slack slack. snoozed Thanks! the then time to update very you your",Result);
    }
}