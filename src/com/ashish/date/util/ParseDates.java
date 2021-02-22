package com.ashish.date.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ParseDates {
    DateFormat outputDtFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    public static void main(String[] args) {

        //DateFormat inputDtFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss-hh:mm");

        DateFormat outputDtFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String inputCallDt = "2020-08-30T22:15:22-04:00";
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));

        //c2.set(year, month, date, hourOfDay, minute, second);
        /*Important*/
        /*TimeDifference between UTC and America/New_York, during day light (1 November to 8 March) savings is of 5 hours*/

        c2.set(Integer.parseInt(inputCallDt.substring(0, 4)), Integer.parseInt(inputCallDt.substring(5, 7))-1,
                Integer.parseInt(inputCallDt.substring(8, 10)), Integer.parseInt(inputCallDt.substring(11, 13)),
                Integer.parseInt(inputCallDt.substring(14, 16)), Integer.parseInt(inputCallDt.substring(17, 19)));

        outputDtFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(outputDtFormat.format(c2.getTime()));
    }
}
