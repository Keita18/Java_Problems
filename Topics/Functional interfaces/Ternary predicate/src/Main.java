import java.util.Objects;
import java.util.function.Function;

class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> a != b && b!= c && c!=a;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
         boolean test(int a, int b, int c);
    }

    public static final StringOperator test = new StringOperator() {
        @Override
        public String apply(String value) {
            return null;
        }

        @Override
        public boolean checkNotNull(String value) {
            return false;
        }
    };
    // a
    interface StringOperator {
        String apply(String value);
        boolean checkNotNull(String value);
    }

    public static final StringOperator1 test1 = String::toString;
    // b
    interface StringOperator1 {
        String apply(String value);
    }

    public static final StringOperator2 test2 = String::toString;

    public static void main(String[] args) {
    }
    // c
    interface StringOperator2 extends Function<String, String> {

    }

    // d
    interface StringOperator3 {
        String apply(String value);

        default boolean checkNotNull(String value) {
            return !Objects.isNull(value);
        }
    }
}