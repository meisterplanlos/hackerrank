package io.chicker.hackerrank.challenges.java_date_and_time;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateConvertor {
    static String getDay(final String day, final String month, final String year) {
        try {
            Date date = new SimpleDateFormat("yyyy-M-d").parse(String.format("%s-%s-%s", year, month, day));
            return new SimpleDateFormat("EEEE").format(date).toUpperCase();
        } catch (Exception e) {
            return "";
        }
    }
}