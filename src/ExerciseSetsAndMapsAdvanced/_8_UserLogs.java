package ExerciseSetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class _8_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> tracking = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")){

            String IP = input.split(" ")[0].split("=")[1];
            String username = input.split(" ")[2].split("=")[1];

            // Проверявам има ли запис за този потребител
            if (tracking.containsKey(username)){
                // а. Ако има:
                // -> взимам мапа за този потребител (IP и брой пъти изпратено съобщение за този IP адрес)
                Map<String, Integer> IpAndCount = tracking.get(username);
                if (IpAndCount.containsKey(IP)){
                // -> ако потребителя е пращал съобщение от този IP адрес, увеличавам бройката с 1
                    int count = IpAndCount.get(IP) + 1;
                    IpAndCount.put(IP, count);
                }
                else {
                    // -> ако не е -> нов запис, че е пратил 1 съобщение от този IP адрес
                    IpAndCount.put(IP, 1);
                }
            }
            else {
                //б. Ако няма:
                // -> правя нов запис с празен мап за неговите IP адреси
                tracking.put(username, new LinkedHashMap<>());
                // -> добавям към празният мап на този потребител, че е изпратил
                // съобщение 1 от този IP адрес (IP -> 1)
                tracking.get(username).put(IP, 1);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : tracking.entrySet()) {

            String username = entry.getKey();
            Map<String, Integer> IPAndCounts = entry.getValue();

            String output = IPAndCounts.entrySet().stream()
                    .map(IPentry -> String.format("%s => %d", IPentry.getKey(), IPentry.getValue()))
                    .collect(Collectors.joining(", "));

            System.out.println(username + ":");
            System.out.println(output + ".");

        }
    }
}
