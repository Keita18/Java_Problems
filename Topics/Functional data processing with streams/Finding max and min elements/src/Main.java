import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here
        var list = stream.collect(Collectors.toList());

        Optional<? extends T> min = list.stream().min(order);
        Optional<? extends T> max = list.stream().max(order);

        minMaxConsumer.accept(min.orElse(null), max.orElse(null));
    }
}