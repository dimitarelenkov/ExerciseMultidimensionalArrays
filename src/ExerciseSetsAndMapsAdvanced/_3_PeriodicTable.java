package ExerciseSetsAndMapsAdvanced;

import java.util.*;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        for (int count = 0; count < n; count++) {

            String command = scanner.nextLine();
            String[] chemicalElements = command.split(" ");

            elements.addAll(List.of(chemicalElements));
        }
        elements.forEach(element -> System.out.print(element + " "));
    }
}
