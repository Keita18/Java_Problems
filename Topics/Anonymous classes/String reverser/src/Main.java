import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = str -> {
            StringBuilder s = new StringBuilder(str);
            return s.reverse().toString();
        };

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {
        String reverse(String str);
    }
}