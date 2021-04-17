package com.hillel;

/**
 * Hello world!
 *
 */
public class Procedure
{
  public   boolean isPalindrom(String stroke){
        int strokeLength = stroke.length()-1;

        for(int i = 0; i < strokeLength; i++)
        {
            if( stroke.charAt(i) != stroke.charAt(strokeLength-i) ){
                return false;
            }
        }
        return true;
    }

    public long calculatePowerRecursively(int base, int powerFactor){
      if(powerFactor != 0){
       return (base * calculatePowerRecursively(base,powerFactor-1));
      }else {
      return 1;
      }
    }

    public long calculatePowerIteratively(int base, int powerFactor){
        long result = base;
        for (int i = 1; i < powerFactor; i++) {
            result = result * base;
        }
        return result;
    }

    public double calculateFactorialRecursively(int number){
      if(number!=0) {
          return (number * calculateFactorialRecursively(number - 1));
      }else {
          return 1;
      }
    }

    public double calculateFactorialIteratively(int number){
        double result = 1;
        if(number!=0) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }


    public double calculateFibonacciRecursively(int number){
        double result = 0;
        if(number == 0){result = 0;}
        if(number == 1){result = 1;}
        if(number > 1) {
            result = calculateFibonacciRecursively(number - 1) + calculateFibonacciRecursively(number - 2);
        }
        return result;
  }

    public double calculateFibonacciIteratively(int number){
        double var1 = 1;
        double var2 = 1;
        double result = 0;
        if(number == 0){result = 0;}
        if(number == 1){result = 1;}
        for (int i = 2; i < number; i++) {
            result = var1 + var2;
            var1 = var2;
            var2 = result;
        }
        return result;
    }

}
