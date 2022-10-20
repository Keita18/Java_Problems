// You can experiment here, it won’t be checked

import java.time.LocalTime;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    // put your code here
    Scanner sc = new Scanner(System.in);
    var t = LocalTime.parse(sc.nextLine()).withSecond(0);
    System.out.println(t);
  }
}
