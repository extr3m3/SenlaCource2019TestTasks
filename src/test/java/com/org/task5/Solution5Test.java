package com.org.task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution5Test {

    @Test
    public void testFormatOutput() {
        assertEquals ( "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99]", Solution5.formatOutput(100));
        assertEquals ( "Ошибка. Длина последовательности не должна превышать 100.", Solution5.formatOutput(150));
        assertEquals ( "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55]", Solution5.formatOutput(60));
        assertEquals ( "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77]", Solution5.formatOutput(80));
    }
}

