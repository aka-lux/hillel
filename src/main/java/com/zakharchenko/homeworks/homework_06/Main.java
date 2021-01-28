package com.zakharchenko.homeworks.homework_06;

import com.zakharchenko.homeworks.utils.Utils;

public class Main {
    public static void main(String[] args) {
        FractionNumber fn14 = new FractionNumber(1, 4);
        FractionNumber fn14equal = new FractionNumber(1, 4);
        FractionNumber fn24 = new FractionNumber(2, 4);
        FractionNumber fn13 = new FractionNumber(1, 3);
        FractionNumber fn1015 = new FractionNumber(10, 15);
        FractionNumber fn1545 = new FractionNumber(15, 45);
        FractionNumber fn142265 = new FractionNumber(142, 265);
        FractionNumber fn172181 = new FractionNumber(172, 181);

        /*Check gcdEvklid*/
        System.out.println(Utils.gcdEvklid(3, 4));
        System.out.println(Utils.gcdEvklid(30, 5));

        try{
            System.out.println(Utils.gcdEvklid(-30, 5));
        }catch (IllegalArgumentException e){
            System.out.println("Exception caught " + e);
        }

        /*Check illegal argument exception*/
        try{
            FractionNumber fn = new FractionNumber(0, 0);
        }catch (IllegalArgumentException e){
            System.out.println("Exception caught " + e);
        }

        /*Check getters*/
        System.out.println("Numarator = " + fn13.getNumerator() + " Denominator = " +fn13.getDenominator());

        /*Check toString*/
        System.out.println(fn14);

        /*Check equals*/
        System.out.println(fn14.equals(fn14equal));

        /*Check puls*/
        System.out.println("1/4 + 2/4 = " + fn14.plus(fn24));
        System.out.println("1/4 + 1/3 = " + fn14.plus(fn13));
        System.out.println("10/15 + 15/45 = " + fn1015.plus(fn1545));
        System.out.println("142/265 + 172/181 = " + fn142265.plus(fn172181));

        /*Check minus*/
        System.out.println("1/3 - 1/4 = " + fn13.minus(fn14));
        System.out.println("1/4 - 1/3 = " + fn14.minus(fn13));
        System.out.println("10/15 - 15/45 = " + fn1015.minus(fn1545));
        System.out.println("142/265 + 172/181 = " + fn142265.minus(fn172181));

        /*Check multiply*/
        System.out.println("1/3 * 1/4 = " + fn13.multiply(fn14));
        System.out.println("10/15 * 15/45 = " + fn1015.multiply(fn1545));
        System.out.println("142/265 + 172/181 = " + fn142265.multiply(fn172181));

        /*Check divide*/
        System.out.println("1/3 / 1/4 = " + fn13.divide(fn14));
        System.out.println("10/15 / 15/45 = " + fn1015.divide(fn1545));
        System.out.println("142/265 + 172/181 = " + fn142265.divide(fn172181));

    }


}

