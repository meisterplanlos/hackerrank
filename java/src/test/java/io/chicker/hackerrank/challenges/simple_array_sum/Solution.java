package io.chicker.hackerrank.challenges.simple_array_sum;

import java.util.Scanner;

public class Solution {

    static long simpleArraySum(int n, int[] ar) {
        long sum = 0;
        for (int entry : ar) {
            sum += entry;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        long result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
