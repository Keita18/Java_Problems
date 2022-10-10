import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Utils {
    public static List<Integer> sortOddEven(List<Integer> numbers) {
        numbers.sort((num1, num2) -> {
            if (num1 % 2 != 0) {
                if (num2 % 2 != 0) {
                    return Integer.compare(num1, num2);
                } else {
                    if (num1 < 0) num1 = -num1;
                    if (num2 < 0) num2 = -num2;
                    return Integer.compare(-num1, num2);
                }
            } else  {
                if (num2 % 2 != 0) {
                    if (num1 < 0) num1 = -num1;
                    if (num2 < 0) num2 = -num2;
                    return Integer.compare(num1, -num2);
                } else {
                    return Integer.compare(-num1, -num2);
                }
            }
        });
        return numbers;
    }

    public static List<Integer> sortOddEven2(List<Integer> numbers) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (Integer a : numbers) {
            if (a % 2 == 0) {
                even.add(a);
            } else {
                odd.add(a);
            }
        }
        odd.sort(Comparator.naturalOrder());
        even.sort(Comparator.reverseOrder());
        odd.addAll(even);
        return odd;
    }
}