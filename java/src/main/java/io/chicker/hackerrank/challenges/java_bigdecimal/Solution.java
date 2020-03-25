package io.chicker.hackerrank.challenges.java_bigdecimal;

import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String v0, String v1) {
                if(v0 == null || v1 == null) {
                    return 0;
                }
                BigDecimal bd0 = new BigDecimal(v0);
                BigDecimal bd1 = new BigDecimal(v1);
                int result = bd0.compareTo(bd1);
                return -result;
            }
        };

        Arrays.sort(s, comparator);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}