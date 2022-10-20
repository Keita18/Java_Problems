import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        System.out.println(LocalDate.ofYearDay(year, first));
        System.out.println(LocalDate.ofYearDay(year, second));
        System.out.println(LocalDate.ofYearDay(year, third));
    }
}