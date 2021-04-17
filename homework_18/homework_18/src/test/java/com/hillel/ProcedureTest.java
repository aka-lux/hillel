package com.hillel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProcedureTest
{
    Procedure proc = new Procedure();

    @Test
    public void isPalindromTest()
    {
        assertTrue( proc.isPalindrom("eve") );
        assertTrue( proc.isPalindrom("qwertrewq") );

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
