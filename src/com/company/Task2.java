package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task2 {
    public static void sum(long n) {
        if (n > 1) {
            BigDecimal un = factorialSum(n).divide(factorial(n), 6, RoundingMode.DOWN);
            System.out.println(un);
        }
    }

    private static BigDecimal factorial(long n) {
        BigDecimal fact = new BigDecimal(1);
        for (long i = n; i > 0; i--) {
            fact = fact.multiply(new BigDecimal(i));
        }
        return fact;
    }

    private static BigDecimal factorialSum(long n) {
        BigDecimal sum =  new BigDecimal(0);
        for (long i = n; i > 0; i--) {
            sum =sum.add(factorial(i));
        }
        return sum;
    }
}
