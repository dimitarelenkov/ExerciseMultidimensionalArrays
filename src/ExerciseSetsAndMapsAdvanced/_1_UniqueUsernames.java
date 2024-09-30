package ExerciseSetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _1_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueNames = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int count = 0; count < n; count++) {
            String name = scanner.nextLine();

            uniqueNames.add(name);
        }
        for (String uniqueName : uniqueNames) {
            System.out.println(uniqueName);
        }
    }
}
