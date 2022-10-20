// You can experiment here, it won’t be checked

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) throws IOException {
      List<String> nList = new ArrayList<>();
      try (Scanner sc = new Scanner(new File("input.txt"));) {
          var n = Integer.parseInt(sc.nextLine());
          while (n > 0) {
              nList.add(sc.nextLine());
              n--;
          }
          var m = Integer.parseInt(sc.nextLine());
          while (m > 0) {
              var mLine = sc.nextLine();
              for (int j = 0; j < nList.size(); j++) {
                  var mLineSplit = mLine.split(" ");
                  for (String s : mLineSplit) {
                      if (nList.get(j).contains(s)) {
                          nList.set(j, nList.get(j) + " : " + mLine);
                          break;
                      }
                  }
              }
              m--;
          }
      }
      nList.forEach(it -> {
          if (!it.contains(":")) {
              System.out.println(it + " :?");
          } else {
              System.out.println(it);
          }
      });
  }
}
