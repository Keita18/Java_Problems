import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);
        var date = LocalDate.parse(sc.nextLine());
        var before = date.minusYears(30);
        var after = date.plusYears(30);
        System.out.println(before);
        System.out.println(after);
    }
}