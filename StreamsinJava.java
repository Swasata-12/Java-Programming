import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsinJava {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        // Creating Streams
        // 1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        // 2. From arrays
        String[] array = { "a", "b", "c" };
        Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");
        // 4. Infinite stream
        // Stream<Integer> generate = Stream.generate(() -> 1).limit(100);
        // Stream.iterate(1, x -> x + 1);

        // Intermediate operations
        // 1. filter
        List<String> list2 = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        long res = list2.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);
        // 2. map
        list2.stream().map(x -> x.toUpperCase());
        // 3. sorted
        Stream<String> sortedStream = list2.stream().sorted((a, b) -> a.length() - b.length());
        // 4. distinct
        list2.stream().filter(x -> x.startsWith("A")).distinct().count();
        // 5. limit
        // Stream.iterate(1, x -> x + 1).limit(100);

        // Terminal operations
        // 1. collect
        List<Integer> list3 = Arrays.asList(1, 2, 4, 5);
        list3.stream().skip(1).collect(Collectors.toList());
        list3.stream().skip(1).toList();
        // 2. for each
        list3.stream().forEach(x -> System.out.println(x));
        // 3. reduce
        list3.stream().reduce((x, y) -> x + y).get();
        // 4. count
        // 5. anyMatch, allMatch, noneMatch
        // 6. findFirst, findAny

        // Example: filtering and collecting names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());
        // Example: squaring and sorting numbers
        List<Integer> num = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(num.stream().map(x -> x * x).sorted().toList());
        // Example: summing values
        List<Integer> values = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(values.stream().reduce((x, y) -> x + y).get());

    }
}
