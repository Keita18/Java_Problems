import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        var date = LocalDateTime.MIN;
        while (num > 0) {
            var givenDate = LocalDateTime.parse(sc.next());
            date = givenDate.isAfter(date) ? givenDate : date;
            num--;
        }
        System.out.println(date);
    }
}