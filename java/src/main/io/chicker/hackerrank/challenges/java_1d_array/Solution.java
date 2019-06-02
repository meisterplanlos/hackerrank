package io.chicker.hackerrank.challenges.java_1d_array;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        Set<Integer> allowedFields = new TreeSet<>();
        for (int i = 0; i < game.length; ++i) {
            if (game[i] == 0) {
                allowedFields.add(i);
            }
            if (i + leap < game.length && game[i + leap] == 0) {
                allowedFields.add(i + leap);
            }
        }
        int lastValue = 0;
        for (Integer i : allowedFields) {
            if (lastValue - i > leap) {
                return false;
            }
            lastValue = i;
        }

        return (game.length - lastValue <= leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}