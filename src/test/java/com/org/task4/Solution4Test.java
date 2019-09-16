package com.org.task4;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution4Test {
    private final static String S1 = "Карл у Клары украл кораллы, а Клара у Карла украла кларнет. Если бы Карл у Клары не украл кораллы, то Клара у Карла не украла б кларнет";



    @Test
    public void testFormatOutput() {
        assertEquals ( "2", Solution4.formatOutput(S1,"Клара"));
        assertEquals ( "2", Solution4.formatOutput(S1,"Карл"));
        assertEquals ( "2", Solution4.formatOutput(S1,"украл"));
        assertEquals ( "4", Solution4.formatOutput(S1,"у"));
    }
}

