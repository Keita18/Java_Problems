// You can experiment here, it won’t be checked

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {
    public static void main(String[] args) {
        // put your code here
        LocalDate date = LocalDate.of(1993, 8, 30);
        LocalTime time = LocalTime.of(23, 45);
        LocalDateTime.of(date, LocalTime.MAX.minusMinutes(15)); // date + time
        LocalDateTime.of(date, time);
        LocalDateTime dt = LocalDateTime.parse("2017-11-30T20:30");
        var a = dt.isEqual(LocalDateTime.parse("2017-11-30T20:20"));

        var b = dt.isAfter(LocalDateTime.parse("2017-11-30T20:30"));

        var c = dt.isBefore(LocalDateTime.parse("2017-11-30T21:20"));

        var d = dt.isAfter(LocalDateTime.parse("2017-11-30T20:20"));
        System.out.printf("%s, %s, %b, %b", a, b, c, d);
    }
}
