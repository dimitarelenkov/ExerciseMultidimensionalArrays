package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _5_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> predicate = number -> number % n == 0;

        numbers.removeIf(predicate);
        numbers.forEach(num -> System.out.print(num + " "));

    }
}
