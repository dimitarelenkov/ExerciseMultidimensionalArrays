package ExerciseSetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_FIxEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        String name = scanner.nextLine();
        while (!name.equals("stop")){

            String email = scanner.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk")
                    && !email.endsWith("com")){

                emails.put(name, email);
            }

            name = scanner.nextLine();
        }
        emails.entrySet().forEach(entry -> System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue()));

    }
}
