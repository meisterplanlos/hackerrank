package io.chicker.hackerrank.challenges.java_stdin_and_stdout_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfInts = 3;
        List<Integer> ints = new LinkedList<Integer>();
        for (int i = 0; i < numberOfInts; ++i) {
            ints.add(scan.nextInt());
        }

        for (int i : ints) {
            System.out.println(i);
        }
    }
}