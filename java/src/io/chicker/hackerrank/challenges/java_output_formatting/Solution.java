package io.chicker.hackerrank.challenges.java_output_formatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; ++i) {
            String stringValue = sc.next();
            int intValue = sc.nextInt();
            System.out.printf("%-15s%03d\n", stringValue, intValue);
        }
        System.out.println("================================");
    }
}
