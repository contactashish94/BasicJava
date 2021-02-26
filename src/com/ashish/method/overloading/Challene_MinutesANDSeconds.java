package com.ashish.method.overloading;

public class Challene_MinutesANDSeconds {
    public static void main(String[] args) {
        String abc = getDurationString(65,45);

        System.out.println("Total duration is  " + abc);
    }
    private static String getDurationString(int minutes, int seconds){
        if (minutes >=0 && (seconds<=0 || seconds <=59)){
            int sec = seconds;
            int duration = minutes*60;
            seconds += duration;
            System.out.println("Total duration is " + seconds);
            long hour = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds;
            System.out.println("Total duration is " + hour + "h " +  remainingMinutes + "m" + " & " + sec +"s");
            return seconds+"";
        }
        else {
            System.out.println("Invalid input");
            return ""+ -1;
        }
    }
}
