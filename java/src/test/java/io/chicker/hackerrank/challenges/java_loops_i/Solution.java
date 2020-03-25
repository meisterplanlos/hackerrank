package io.chicker.hackerrank.challenges.java_loops_i;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int intValue = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int multiplier = 1; multiplier <= 10; ++multiplier) {
            System.out.printf(
                    "%d x %d = %d\n",
                    intValue,
                    multiplier,
                    intValue * multiplier);
        }

        scanner.close();
    }
}
