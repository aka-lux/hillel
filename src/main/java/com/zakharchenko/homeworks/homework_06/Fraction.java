package com.zakharchenko.homeworks.homework_06;


public interface Fraction {

    Fraction plus(Fraction fraction);

    Fraction minus(Fraction fraction);

    Fraction multiply(Fraction fraction);

    Fraction divide(Fraction fraction);

    long getNumerator();

    long getDenominator();

}
