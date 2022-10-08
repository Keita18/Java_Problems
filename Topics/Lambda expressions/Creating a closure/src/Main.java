import java.util.function.UnaryOperator;

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = (s -> {
        var res = s;
       return (PREFIX + res.trim() + SUFFIX);
    });

    public static void main(String[] args) {
        System.out.println(operator.apply("Bonjour Keita"));


    }
}
