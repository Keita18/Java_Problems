// You can experiment here, it won’t be checked

import java.time.LocalTime;

public class Task {
  public static void main(String[] args) {
    // put your code here
    var now = LocalTime.now();
    var t1 = LocalTime.parse("11:20");
    var t3 = t1.toSecondOfDay();
    var t4 = t1.getHour();
    var t5 = LocalTime.ofSecondOfDay(3600);
    var t6 = LocalTime.of(t4, 0);


    System.out.println(t5);
  }
}
