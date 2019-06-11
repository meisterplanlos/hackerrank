package io.chicker.hackerrank.challenges.java_anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int numChars = 26;

        char[] characterCountsA = new char[numChars];
        for (int i = 0; i < numChars; ++i) {
            characterCountsA[i] = 0;
        }

        char[] characterCountsB = new char[numChars];
        for (int i = 0; i < numChars; ++i) {
            characterCountsB[i] = 0;
        }

        String alow = a.toLowerCase();
        for (int i = 0; i < alow.length(); ++i) {
            int index = alow.charAt(i) - 'a';
            ++characterCountsA[index];
        }

        String blow = b.toLowerCase();
        for (int i = 0; i < blow.length(); ++i) {
            int index = blow.charAt(i) - 'a';
            ++characterCountsB[index];
        }

        for (int i = 0; i < numChars; ++i) {
            if (characterCountsA[i] != characterCountsB[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
