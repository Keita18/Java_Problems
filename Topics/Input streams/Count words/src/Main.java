import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        var a = reader.readLine().trim().split("\\s+").length;
        a = a > 1? a : 0;
        System.out.println(a);
        reader.close();
    }
}