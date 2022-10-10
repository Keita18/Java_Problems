import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        var a = inputStream.readAllBytes();
        for (byte b : a) {
            System.out.print(b);
        }
    }
}
