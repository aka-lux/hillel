package com.hillel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProcedureTest
{
    Procedure proc = new Procedure();

    @Test
    public void isPalindromTest()
    {
        assertEquals(proc.isPalindrom("eve"),true);
        assertEquals(proc.isPalindrom("qwertrewq"),true);

    }

    @Test
    public void calculatePowerTest(){
        assertEquals(proc.calculatePowerRecursively(10,3),1000);
        assertEquals(proc.calculatePowerRecursively(5,3),125);

        assertEquals(proc.calculatePowerIteratively(10,3),1000);
        assertEquals(proc.calculatePowerIteratively(5,3),125);
    }

    @Test
    public void calculateFactorialTest(){
        assertEquals(Double.toString(proc.calculateFactorialIteratively(170)),"7.257415615307994E306");
        assertEquals(Double.toString(proc.calculateFactorialRecursively(170)), "7.257415615307994E306");
    }

    @Test
    public void calculateFibonacciTest(){
        assertEquals(Double.toString(proc.calculateFibonacciIteratively(7)),"13.0");
        assertEquals(Double.toString(proc.calculateFibonacciRecursively(7)),"13.0");
    }

}
