package io.chicker.hackerrank.challenges.java_stdin_stdout;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intValue = scan.nextInt();
        double doubleValue = scan.nextDouble();
        scan.nextLine();
        String stringValue = scan.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}