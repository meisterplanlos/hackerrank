package io.chicker.hackerrank.contests.projecteuler.challenges.euler235;

public class Solution {
    public static double f(double a, double d, double n, double x, double r) {
        double rToTheN = Math.pow(r, n);
        double rToTheNPlusOne = rToTheN * r;

        double numerator = a * rToTheNPlusOne;
        numerator -= a * rToTheN;
        numerator -= a * r;
        numerator += a;
        numerator -= d * n * rToTheNPlusOne;
        numerator += d * rToTheN;
        numerator += d * n * rToTheN;
        numerator -= d;

        double denominator = r - 1;
        denominator *= denominator;

        double result = numerator / denominator;
        result += x;

        return result;
    }

    public static double fprime(double a, double d, double n, double x, double r) {
        double rToTheNMinusOne = Math.pow(r, n - 1);
        double rToTheN = rToTheNMinusOne * r;
        double rToTheNPlusOne = rToTheN * r;

        double numerator = -a * n * rToTheNMinusOne;
        numerator += a * (n + 1) * rToTheN;
        numerator -= a;
        numerator += d * n * n * rToTheNMinusOne;
        numerator += d * n * rToTheNMinusOne;
        numerator -= d * n * (n + 1) * rToTheN;

        double denominator = (r - 1);
        denominator *= denominator;

        double result = numerator / denominator;

        numerator = a * rToTheNPlusOne;
        numerator -= a * rToTheN;
        numerator -= a * r;
        numerator += a;
        numerator -= d * n * rToTheNPlusOne;
        numerator += d * rToTheN;
        numerator += d * n * rToTheN;
        numerator -= d;
        numerator *= 2;

        denominator *= denominator;

        result -= numerator / denominator;
        result += x;

        return result;
    }

    public static double findSolution(double precision, double a, double d, double n, double x) {
        double r = 0;
        double count = 0;
        while (true) {
            double f = f(a, d, n, x, r);
            double fprime = fprime(a, d, n, x, r);
            System.out.println("   rn = " + r);
            System.out.println(" f(r) = " + f);
            System.out.println("f'(r) = " + fprime);
            if (Math.abs(f) < precision || count > 10) {
                System.out.println("Result found: " + r);
                return r;
            }
            r = r - f / fprime;
            System.out.println(" rn+1 = " + r);
            System.out.println();
            ++count;
        }
    }

    public static void main(String[] args) {
        double result = findSolution(0.0000000000001, 1, 1, 3000, 100000000);
        System.out.println("Result: " + result);
    }

}
