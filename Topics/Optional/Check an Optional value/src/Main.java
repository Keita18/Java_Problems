import java.util.Optional;

class Main {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        // use provider.getValue() to get Optional<String>
//        provider.getValue().ifPresent(System.out::println);

        var s1 = "aaaaaa";
        var s11 = "a";
        var s2 = "bbbbbbbbbbb";
        var s3 = "AA";
        var s4 = "lolo";

        System.out.println();
    }
}

class ValueProvider {
    private Optional<String> inputOpt; // cache to provide reproducing method invocation

    public Optional<String> getValue() {
        if (inputOpt == null) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String input = scanner.next();
            inputOpt = "null".equals(input) ? Optional.empty() : Optional.of(input);
        }

        return inputOpt;
    }
}