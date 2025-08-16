import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        System.out.println("Enter a number to check if it is Even or not: ");
        int n = sc.nextInt();
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Consumer<Integer> print = x -> System.out.println("Printing using Consumer: " + x);
        Supplier<String> supply = () -> "Hello World";
        System.out.println("Number " + n + " is Even ?: " + isEven.test(n)); // Calling Predicate
        System.out.println("The double of the number " + n + " is: " + doubleIt.apply(n)); // Calling Function
        print.accept(56); // Calling Consumer
        System.out.println(supply.get()); // Calling Supplier
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println); // Method Reference
        sc.close();
    }
}
