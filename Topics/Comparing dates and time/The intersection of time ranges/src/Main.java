import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        var t1 = LocalTime.parse(sc.next());
        var t2 = LocalTime.parse(sc.next());
        var z1 = LocalTime.parse(sc.next());
        var z2 = LocalTime.parse(sc.next());

        if (t1.isBefore(z1)) {
            System.out.println(t2.isAfter(z1) || t2.equals(z1));
        } else if (z1.isBefore(t1)) {
            System.out.println(z2.isAfter(t1) || z2.equals(t1));
        } else System.out.println(true);
    }
}