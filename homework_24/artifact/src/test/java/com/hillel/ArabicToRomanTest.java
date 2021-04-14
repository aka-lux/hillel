package com.hillel;

import org.junit.Assert;
import org.junit.Test;

public class ArabicToRomanTest {

    String actual = "";

    @Test
    public void testDigits() {
        actual = new ArabicToRoman().convert(1);
        Assert.assertEquals("expected result is 'II'", "I", actual);

        actual = new ArabicToRoman().convert(2);
        Assert.assertEquals("expected result is 'II'", "II", actual);

        actual = new ArabicToRoman().convert(3);
        Assert.assertEquals("expected result is 'III'", "III", actual);

        actual = new ArabicToRoman().convert(4);
        Assert.assertEquals("expected result is 'IV'", "IV", actual);

        actual = new ArabicToRoman().convert(5);
        Assert.assertEquals("expected result is 'V'", "V", actual);

        actual = new ArabicToRoman().convert(6);
        Assert.assertEquals("expected result is 'VI'", "VI", actual);

        actual = new ArabicToRoman().convert(7);
        Assert.assertEquals("expected result is 'VII'", "VII", actual);

        actual = new ArabicToRoman().convert(8);
        Assert.assertEquals("expected result is 'VIII'", "VIII", actual);

        actual = new ArabicToRoman().convert(9);
        Assert.assertEquals("expected result is 'IX'", "IX", actual);

        actual = new ArabicToRoman().convert(10);
        Assert.assertEquals("expected result is 'X'", "X", actual);

    }


    @Test
    public void testNumbers() {
        actual = new ArabicToRoman().convert(39);
        Assert.assertEquals("expected result is 'XXXIX'", "XXXIX", actual);

        actual = new ArabicToRoman().convert(246);
        Assert.assertEquals("expected result is 'CCXLVI'", "CCXLVI", actual);

        actual = new ArabicToRoman().convert(789);
        Assert.assertEquals("expected result is 'DCCLXXXIX'", "DCCLXXXIX", actual);

        actual = new ArabicToRoman().convert(2421);
        Assert.assertEquals("expected result is 'MMCDXXI'", "MMCDXXI", actual);
    }
}