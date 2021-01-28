package com.zakharchenko.homeworks.homework_07;

import com.zakharchenko.homeworks.homework_06.Fraction;
import com.zakharchenko.homeworks.homework_06.FractionNumber;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.DEFAULT)
class FractionNumberTest {

    private static FractionNumber fraction1;
    private static FractionNumber fraction2;
    private static Fraction result;

    @Test
    void testBadFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionNumber(1, 0));
    }

    @Test
    void testNegativeFractionCreation() {
        fraction1 = new FractionNumber(-4, 5);
        assertEquals(fraction1.toString(), "-4/5");
    }

    @Test
    void testGetters() {
        fraction1 = new FractionNumber(1, 5);
        assertEquals(fraction1.getNumerator(), 1);
        assertEquals(fraction1.getDenominator(), 5);
    }

    @Test
    void testToString() {
        fraction1 = new FractionNumber(1, 4);

        assertEquals(fraction1.toString(), "1/4");
        assertNotEquals(fraction1.toString(), "4/1");
    }

    @Test
    void testEquals() {
        fraction1 = new FractionNumber(1, 3);
        fraction2 = new FractionNumber(2, 3);

        assertEquals(new FractionNumber(1, 3), fraction1);
        assertNotEquals(fraction2, fraction1);
        assertEquals(new FractionNumber(3, 9), fraction1);
        assertEquals(new FractionNumber(3, 1), new FractionNumber(9, 3));
        assertNotEquals(new FractionNumber(3, 9), new FractionNumber(9, 3));
    }

    @Test
    void testPlusWithTheSameDenominator() {
        fraction1 = new FractionNumber(1, 3);
        fraction2 = new FractionNumber(2, 3);
        result = fraction1.plus(fraction2);
        assertEquals(new FractionNumber(3, 3), result);
        assertEquals(new FractionNumber(1, 1), result);
    }

    @Test
    void testPlusWithNotTheSameDenominator() {
        fraction1 = new FractionNumber(1, 4);
        fraction2 = new FractionNumber(1, 3);
        result = fraction1.plus(fraction2);
        assertEquals(new FractionNumber(7, 12), result);

        fraction1 = new FractionNumber(10, 15);
        fraction2 = new FractionNumber(15, 45);
        result = fraction1.plus(fraction2);
        assertEquals(new FractionNumber(1, 1), result);
    }

    @Test
    void testMinusWithTheSameDenominator() {
        fraction1 = new FractionNumber(1, 4);
        fraction2 = new FractionNumber(1, 3);
        result = fraction1.minus(fraction2);
        assertEquals(new FractionNumber(-1, 12), result);

        fraction1 = new FractionNumber(1, 3);
        fraction2 = new FractionNumber(1, 4);
        result = fraction1.minus(fraction2);
        assertEquals(new FractionNumber(1, 12), result);
    }

    @Test
    void testMinusWithNotTheSameDenominator() {
        fraction1 = new FractionNumber(10, 15);
        fraction2 = new FractionNumber(15, 45);
        result = fraction1.minus(fraction2);
        assertEquals(new FractionNumber(1, 3), result);

        fraction1 = new FractionNumber(142, 265);
        fraction2 = new FractionNumber(172, 181);
        result = fraction1.minus(fraction2);
        assertEquals(new FractionNumber(-19878, 47965), result);
    }

    @Test
    void testMultiply() {
        fraction1 = new FractionNumber(1, 3);
        fraction2 = new FractionNumber(1, 4);
        result = fraction1.multiply(fraction2);
        assertEquals(new FractionNumber(1, 12), result);

        fraction1 = new FractionNumber(10, 15);
        fraction2 = new FractionNumber(15, 45);
        result = fraction1.multiply(fraction2);
        assertEquals(new FractionNumber(2, 9), result);
    }

    @Test
    void testDivide() {
        fraction1 = new FractionNumber(1, 3);
        fraction2 = new FractionNumber(1, 4);
        result = fraction1.divide(fraction2);
        assertEquals(new FractionNumber(4, 3), result);

        fraction1 = new FractionNumber(10, 15);
        fraction2 = new FractionNumber(15, 45);
        result = fraction1.divide(fraction2);
        assertEquals(new FractionNumber(2, 1), result);

        fraction1 = new FractionNumber(142, 265);
        fraction2 = new FractionNumber(172, 181);
        result = fraction1.divide(fraction2);
        assertEquals(new FractionNumber(12851, 22790), result);

    }
}