package io.chicker.hackerrank.challenges.java_string_compare;

import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        String currentSubstring = "";
        for(int i = 0; i < s.length() - k + 1; ++i) {
            currentSubstring = s.substring(i, i + k);
            if(smallest.compareTo(currentSubstring) > 0) {
                smallest = currentSubstring;
            }
            if(largest.compareTo(currentSubstring) < 0) {
                largest = currentSubstring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
