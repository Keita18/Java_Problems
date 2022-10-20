import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();

        if (msg != null) {

            if (msg.length() > 0) {
                System.out.printf(
                        "The variable is not empty, the length is %d", msg.length());
            }
        }
    }
}