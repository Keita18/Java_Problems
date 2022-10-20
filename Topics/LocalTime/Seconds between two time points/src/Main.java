import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        LocalTime t1 = LocalTime.parse(scanner.nextLine());
        LocalTime t2 = LocalTime.parse(scanner.nextLine());
        var t3 = t1.toSecondOfDay();
        var t4 = t2.toSecondOfDay();
        var t = Math.abs(t3 - t4);

        System.out.println(t);
    }
}