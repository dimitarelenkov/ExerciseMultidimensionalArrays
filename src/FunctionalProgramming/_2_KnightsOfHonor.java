package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _2_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .toList();

        names.forEach(name -> System.out.println("Sir " + name));
    }
}
