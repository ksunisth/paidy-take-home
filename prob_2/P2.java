/**
 * Problem:
 * Write a function that takes two dates 
 * (date_from, date_to, in dd-mm-yyyy format) 
 * and returns the number of Sundays in that range.
 */
package prob_2;

import java.util.Calendar;

public class P2 {
    // convert String date to integer array containing [dd, mm, yyyy]
    public int[] getDatesArray(String date) {
        String[] strDates = date.split("-");
        int[] intDates = new int[strDates.length];
        for (int i = 0; i < strDates.length; i++) {
            intDates[i] = Integer.parseInt(strDates[i]);
        }

        return intDates;
    }

    public long countSundays(String date_from, String date_to) {
        // set from date
        int[] from = getDatesArray(date_from);
        Calendar start = Calendar.getInstance();
        start.set(from[2], from[1] - 1, from[0]);

        // set to date
        int[] to = getDatesArray(date_to);
        Calendar end = Calendar.getInstance();
        end.set(to[2], to[1] - 1, to[0]);

        long numOfSundays = 0;

        if (end.before(start)) {
            return -1;
        }

        while (start.before(end)) {
            if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                numOfSundays++;
                // move seven days ahead, i.e. next Sunday
                start.add(Calendar.DATE, 7);
            } else {
                // move to next day to find Sunday
                start.add(Calendar.DATE, 1);
            }
        }

        return numOfSundays;
    }
}
