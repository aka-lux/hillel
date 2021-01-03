package com.zakharchenko.lectures.lecture_01;

public class task_01 {
    public static void main(String[] args){
        int a = 2;
        int b = 15;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("a="+a+" b="+b);

        a=2;
        b=15;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a+" b="+b);

    }

}
