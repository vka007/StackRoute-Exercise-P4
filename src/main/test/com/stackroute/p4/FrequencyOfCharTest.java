package com.stackroute.p4;

import static org.junit.Assert.*;

public class FrequencyOfCharTest {

    FrequencyOfChar ob ;

    @org.junit.Before
    public void setUp() throws Exception {
    ob = new FrequencyOfChar();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    ob = null;
    }

    @org.junit.Test
    public void checkFreqAllLower() {

        String Result = ob.charFreq("vineet kumar vin eet ee",'e');
        assertEquals(6+"",Result);
    }

    @org.junit.Test
    public void checkFreqMixChar() {

        String Result = ob.charFreq("StaCK St ACK Ro AT",'A');
        assertEquals(3+"",Result);
    }

    @org.junit.Test
    public void checkFreqMixCharAndDigit() {

        String Result = ob.charFreq("Staa3CK S8t ACK32 Ro AT9",'t');
        assertEquals(3+"",Result);
    }

    @org.junit.Test
    public void checkFreqInvalidChar() {

        String Result = ob.charFreq("Staa3CK S8t ACK32 Ro AT9",'3');
        assertEquals("Invalid input, Enter a valid char",Result);
    }

}