package ro.sda.spring.java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {


    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println("DAY OF THE YEAR: " + localDate.getDayOfYear());
        System.out.println("DAY OF THE WEEK: " + localDate.getDayOfWeek());
        System.out.println("DAY OF THE MONTH: " + localDate.getDayOfMonth());
        System.out.println("PRESENT DATE: " + localDate);
        System.out.println("PRESENT DATE +100 DAYS: " + localDate.plusDays(100));
        System.out.println("---------------------------------");

        LocalTime localTime = LocalTime.now();

        System.out.println("CURRENT TIME: " + localTime);
        System.out.println("CURRENT HOUR: " + localTime.getHour());
        System.out.println("CURRENT MINUTE: " + localTime.getMinute());
        System.out.println("CURRENT TIME -10H: " + localTime.minusHours(10));
        System.out.println("---------------------------------");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("CURRENT TIME & DATE: " + localDateTime);
        System.out.println("---------------------------------");

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("CURRENT TIME & DATE & TIMEZONE: " + zonedDateTime);
        System.out.println("---------------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss zzz");

        System.out.println("CURRENT TIME & DATE & TIMEZONE(FORMATTED): " + zonedDateTime.format(formatter));
    }


}
