package com.zakharchenko.homeworks.homework_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatTest {
    Stat<Byte> stat_byte = new Stat<>(new Byte[]{1,2,3,4});
    Stat<Short> stat_short = new Stat<>(new Short[]{1,2,3,4});
    Stat<Integer> stat_int = new Stat<>(new Integer[]{1,2,3,4});
    Stat<Long> stat_long = new Stat<>(new Long[]{1L,2L,3L,4L});
    Stat<Float> stat_float = new Stat<>(new Float[]{1.0F,2.0F,3.0F,4.0F});
    Stat<Double> stat_double = new Stat<>(new Double[]{1.0,2.0,3.0,4.0});

    @Test
    public void testPrintData(){
        stat_byte.printData();
        stat_short.printData();
        stat_int .printData();
        stat_long.printData();
        stat_float.printData();
        stat_double.printData();
    }

    @Test
    public void testAverage(){
        assertEquals(stat_byte.average(), 2.5);
        assertEquals(stat_short.average(), 2.5);
        assertEquals(stat_int.average(), 2.5);
        assertEquals(stat_long.average(), 2.5);
        assertEquals(stat_float.average(), 2.5);
        assertEquals(stat_double.average(), 2.5);

    }

    @Test
    public void testIsSameAverage(){
        assertEquals(stat_byte.isSameAverage(stat_double), true );
        assertEquals(stat_short.isSameAverage(stat_float), true);
        assertEquals(stat_int.isSameAverage(stat_long), true);
        assertEquals(stat_long.isSameAverage(stat_int), true);
        assertEquals(stat_float.isSameAverage(stat_short), true);
        assertEquals(stat_double.isSameAverage(stat_byte), true);
    }

}
