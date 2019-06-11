package io.chicker.hackerrank.challenges.java_datatypes;

import java.util.Scanner;


class Solution {
    public static void test(final long x) {
        System.out.println(x + " can be fitted in:");
        Solution.test(x, Byte.MIN_VALUE, Byte.MAX_VALUE, "* byte");
        Solution.test(x, Short.MIN_VALUE, Short.MAX_VALUE, "* short");
        Solution.test(x, Integer.MIN_VALUE, Integer.MAX_VALUE, "* int");
        Solution.test(x, Long.MIN_VALUE, Long.MAX_VALUE, "* long");
    }

    public static void test(final long x, final long lowerBound, final long upperBound, final String output) {
        if (x >= lowerBound && x <= upperBound) {
            System.out.println(output);
        }
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String canBeFitted = " can be fitted in:";

        for (int i = 0; i < t; ++i) {
            try {
                Solution.test(sc.nextLong());
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
