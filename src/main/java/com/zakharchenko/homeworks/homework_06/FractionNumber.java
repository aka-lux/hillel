package com.zakharchenko.homeworks.homework_06;

import com.zakharchenko.homeworks.utils.Utils;

public class FractionNumber implements Fraction {
    private long numerator = 1;
    private long denominator = 1;

    public FractionNumber(long numerator, long denominator) {
        if (numerator == 0)
            throw new IllegalArgumentException("Numerator cant be zero value");
        else {
            this.numerator = numerator;
        }
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator cant be zero value");
        else {
            this.denominator = denominator;
        }
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Fraction plus(Fraction fractionNumber) {
        long numerator = 1;
        long denominator = 1;
        long gcd = 1;

        if (fractionNumber.getDenominator() == this.denominator) {
            numerator = this.numerator + fractionNumber.getNumerator();
            denominator = this.denominator;
        } else {
            numerator = this.numerator * fractionNumber.getDenominator() + this.denominator * fractionNumber.getNumerator();
            denominator = this.denominator * fractionNumber.getDenominator();
        }

        gcd = Utils.gcdEvklid(Math.abs(numerator), Math.abs(denominator));

        if (1 < gcd) {
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }

        return new FractionNumber(numerator, denominator);
    }

    public Fraction minus(Fraction fractionNumber) {
        long numerator = 1;
        long denominator = 1;
        long gcd = 1;

        if (fractionNumber.getDenominator() == this.denominator) {
            numerator = this.numerator - fractionNumber.getNumerator();
            denominator = this.denominator;
        } else {
            numerator = this.numerator * fractionNumber.getDenominator() - this.denominator * fractionNumber.getNumerator();
            denominator = this.denominator * fractionNumber.getDenominator();
        }

        gcd = Utils.gcdEvklid(Math.abs(numerator), Math.abs(denominator));
        if (1 < gcd) {
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }

        return new FractionNumber(numerator, denominator);
    }

    public Fraction multiply(Fraction fractionNumber) {
        long numerator = 1;
        long denominator = 1;
        long gcd = 1;

        numerator = this.numerator * fractionNumber.getNumerator();
        denominator = this.denominator * fractionNumber.getDenominator();

        gcd = Utils.gcdEvklid(Math.abs(numerator), Math.abs(denominator));

        if (1 < gcd) {
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }

        return new FractionNumber(numerator, denominator);
    }

    public Fraction divide(Fraction fractionNumber) {
        long numerator = 1;
        long denominator = 1;
        long gcd = 1;

        numerator = this.numerator * fractionNumber.getDenominator();
        denominator = this.denominator * fractionNumber.getNumerator();

        gcd = Utils.gcdEvklid(Math.abs(numerator), Math.abs(denominator));

        if (1 < gcd) {
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }

        return new FractionNumber(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FractionNumber that = (FractionNumber) o;

        if (numerator != that.numerator) return false;
        return denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        int result = (int) (numerator ^ (numerator >>> 32));
        result = 31 * result + (int) (denominator ^ (denominator >>> 32));
        return result;
    }
}
