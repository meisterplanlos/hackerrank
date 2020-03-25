package io.chicker.hackerrank.challenges.java_currency_formatter;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat indianFormat = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        DecimalFormatSymbols dfs = ((DecimalFormat)indianFormat).getDecimalFormatSymbols();
        dfs.setCurrencySymbol("Rs.");
        ((DecimalFormat)indianFormat).setDecimalFormatSymbols(dfs);

        NumberFormat chineseFormat = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        dfs = ((DecimalFormat)chineseFormat).getDecimalFormatSymbols();
        dfs.setCurrencySymbol("￥");
        ((DecimalFormat)chineseFormat).setDecimalFormatSymbols(dfs);

        NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        dfs = ((DecimalFormat)frenchFormat).getDecimalFormatSymbols();
        dfs.setCurrencySymbol("€");
        ((DecimalFormat)frenchFormat).setDecimalFormatSymbols(dfs);

        String us = usFormat.format(payment);
        String india = indianFormat.format(payment);
        String china = chineseFormat.format(payment);
        String france = frenchFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
