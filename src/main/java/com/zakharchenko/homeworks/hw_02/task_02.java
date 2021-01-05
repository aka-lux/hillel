package com.zakharchenko.homeworks.hw_02;

public class task_02 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        double p = (a+b+c)/2;

        System.out.println("Input: a="+ a +", b="+ b +", c="+ c);
        System.out.print("Result: " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));

    }
}
