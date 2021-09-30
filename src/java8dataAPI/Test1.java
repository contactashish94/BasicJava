package java8dataAPI;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        System.out.printf("%d-%d-%d",dd,mm,yy);
        System.out.println();


        LocalTime time  = LocalTime.now();
        System.out.println(time);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime dt1 = LocalDateTime.of(1994, Month.NOVEMBER,12,8,00);
        System.out.println(dt1.minusMonths(13));

        Year y = null;
        y.isLeap();
    }
}
