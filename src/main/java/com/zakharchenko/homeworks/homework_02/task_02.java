package com.zakharchenko.homeworks.homework_02;

public class task_02 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        double p = (a + b + c) / 2;
        double d = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Input: a=" + a + ", b=" + b + ", c=" + c);
        System.out.print("Result: " + d);

    }
}
