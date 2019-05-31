package io.chicker.hackerrank.challenges.java_loops_ii;

import java.util.Scanner;

class Solution {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for (int testCase = 0; testCase < numberOfTestCases; ++numberOfTestCases) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int index = 0; index < n; ++index) {
                System.out.print(a + b * ((2 << index) - 1));
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}
