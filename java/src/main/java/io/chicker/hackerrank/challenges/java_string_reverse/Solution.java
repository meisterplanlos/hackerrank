package io.chicker.hackerrank.challenges.java_string_reverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int length = A.length();
        boolean isAnagram = true;
        for(int i = 0; i < length / 2; ++i) {
            if(A.charAt(i) != A.charAt(length - 1 - i)) {
                isAnagram = false;
                break;
            }
        }

        if(isAnagram) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}