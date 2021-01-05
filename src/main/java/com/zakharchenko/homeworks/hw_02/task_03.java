package com.zakharchenko.homeworks.hw_02;

public class task_03 {
    public static void main(String[] args) {
        int a = 1;
        int b = -1;
        int c = -2;

        int D = b*b-4*a*c;
        int x1 = (int) (-b+Math.sqrt(D))/(2*a);
        int x2 = (int) (-b-Math.sqrt(D))/(2*a);

        System.out.println("Input: a="+ a +", b="+ b +", c="+ c);

        if(D > 0){
            if(x1 < x2){
                System.out.println("Output: x1="+ x1 +" x2="+ x2);
            }else{
                System.out.println("Output: x1="+ x2 +" x2="+ x1);
            }
        }

        if(0 == D){
            System.out.println("Output: x="+ (-b/(2*a)) );
        }

        if(D < 0){
            System.out.println("Output: no roots");
        }

    }
}
