package com.zakharchenko.lectures.lecture_01;

public class task_02 {

    public static void main(String[] args) {

        int humanYears = 4;
        if(args.length>0){humanYears=Integer.parseInt(args[0]);}

        System.out.println("humanYears=" + humanYears );

        int catYears =  0;
        int dogYears = 0;

        for (int i = 0; i<=humanYears; i++){
            if(i==1){
                catYears=+15;
                dogYears=+15;
            }
            if(i==2){
                catYears+=9;
                dogYears+=9;
            }
            if(i>2) {
                catYears += 4;
                dogYears += 5;
            }
        }

        System.out.println("catYears=" + catYears + " dogYears=" + dogYears);


    }




}