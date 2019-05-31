package io.chicker.hackerrank.challenges.java_end_of_file;

import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long counter = 1l;
        while(in.hasNextLine())
        {
            System.out.printf("%d %s\n", counter++, in.nextLine());
        }
    }
}
