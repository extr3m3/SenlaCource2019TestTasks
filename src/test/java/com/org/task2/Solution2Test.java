package com.org.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void testGcd() {
        assertEquals ( 2, Solution2.gcd(10,24));
        assertEquals ( 12, Solution2.gcd(12,24));
        assertEquals ( 1, Solution2.gcd(11,24));
    }
    @Test
    public void testLcm() {
        assertEquals ( 12, Solution2.lcm(3,4));
        assertEquals ( 9, Solution2.lcm(3,9));
        assertEquals ( 60, Solution2.lcm(5,12));
    }
    @Test
    public void testFormatOutput() {
        assertEquals ( "Наибольший общий делитель: 2, Наименьшее общее кратное: 120", Solution2.formatOutput(10,24));
        assertEquals ( "Наибольший общий делитель: 1, Наименьшее общее кратное: 12", Solution2.formatOutput(3,4));
        assertEquals ( "Наибольший общий делитель: 1, Наименьшее общее кратное: 60", Solution2.formatOutput(5,12));
    }
}

