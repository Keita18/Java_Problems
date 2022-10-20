import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        var localDate = LocalDate.of(year, month, 1);
        var nextMonth = localDate.plusMonths(1);

        while (localDate.isBefore(nextMonth)) {
            if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(localDate);
            }

            localDate = localDate.plusDays(1);
        }

    }
}