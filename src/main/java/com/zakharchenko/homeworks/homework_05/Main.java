package com.zakharchenko.homeworks.homework_05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date newDate = new Date(1990, 1, 1);
        Date newDate1 = new Date(1988, 11, 11);

        OrderMutable orderMutable = new OrderMutable(1, newDate, 75048, "Ukraine, Odessa");
        OrderMutable orderMutableTwo = new OrderMutable(1, newDate, 75048, "Ukraine, Odessa");
        System.out.println(orderMutable);
        newDate.setYear(1010);
        System.out.println(orderMutable);
        System.out.println(orderMutable == orderMutableTwo);

        OrderImmutable orderImmutable = new OrderImmutable(2, newDate1, 740266, "Ukraine, Lviv");
        OrderImmutable orderImmutableTwo = new OrderImmutable(2, newDate1, 740266, "Ukraine, Lviv");
        System.out.println(orderImmutable);
        newDate1.setYear(1000);
        System.out.println(orderImmutableTwo);
        System.out.println(orderImmutable == orderImmutableTwo);
        System.out.println(orderImmutable.equals(orderImmutableTwo));

    }
}
