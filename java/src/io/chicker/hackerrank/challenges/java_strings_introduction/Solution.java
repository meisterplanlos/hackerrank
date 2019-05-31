package io.chicker.hackerrank.challenges.java_strings_introduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (A.length() > 0) {
            System.out.print(A.substring(0, 1).toUpperCase());
            System.out.print(A.substring(1));
        }
        if (B.length() > 0) {
            System.out.print(" ");
            System.out.print(B.substring(0, 1).toUpperCase());
            System.out.print(B.substring(1));
        }
    }
}
