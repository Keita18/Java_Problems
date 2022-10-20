import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        // put your code here
        Scanner sc = new Scanner(System.in);
        var t = LocalTime.parse(sc.nextLine()).withSecond(0);
        System.out.println(t);
    }
}