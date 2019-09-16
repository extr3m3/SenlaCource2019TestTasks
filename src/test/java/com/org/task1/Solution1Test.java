package com.org.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void testEven() {
        assertTrue ( Solution1.isEven(50));
        assertTrue ( Solution1.isEven(45226));
        assertTrue ( Solution1.isEven(455254));
        assertTrue ( Solution1.isEven(78945412));
        assertTrue ( Solution1.isEven(465554522));
        assertTrue ( Solution1.isEven(0));
        assertFalse ( Solution1.isEven(1));
        assertFalse ( Solution1.isEven(3));
        assertFalse ( Solution1.isEven(13));
        assertTrue ( Solution1.isEven(-100));
        assertFalse ( Solution1.isEven(-45221));
        assertFalse ( Solution1.isEven(-455253));
        assertFalse ( Solution1.isEven(-78945415));
        assertFalse (  Solution1.isEven(-465554527));
    }
    @Test
    public void testPrime() {
        assertFalse ( Solution1.isPrime(50));
        assertFalse ( Solution1.isPrime(45226));
        assertFalse ( Solution1.isPrime(455254));
        assertFalse ( Solution1.isPrime(78945412));
        assertFalse ( Solution1.isPrime(465554522));
        assertFalse ( Solution1.isPrime(0));
        assertFalse ( Solution1.isPrime(1));
        assertTrue ( Solution1.isPrime(3));
        assertTrue ( Solution1.isPrime(13));
        assertFalse ( Solution1.isPrime(-100));
        assertFalse ( Solution1.isPrime(-45221));
        assertFalse ( Solution1.isPrime(-455253));
        assertFalse ( Solution1.isPrime(-78945415));
        assertFalse ( Solution1.isPrime(-465554527));
    }
    @Test
    public void testFormatOutput() {
        assertEquals ( "четное", Solution1.formatOutput(0));
        assertEquals ( "нечетное", Solution1.formatOutput(1));
        assertEquals ( "четное простое", Solution1.formatOutput(2));
        assertEquals ( "нечетное простое", Solution1.formatOutput(101));
        assertEquals ( "нечетное", Solution1.formatOutput(-103));
    }
}

