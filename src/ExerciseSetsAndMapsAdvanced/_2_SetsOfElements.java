package ExerciseSetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _2_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> FirstNumber = new LinkedHashSet<>();
        Set<Integer> SecondNumber = new LinkedHashSet<>();

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstNumber = numbers[0];
        int secondNumber = numbers[1];

        for (int count = 0; count < firstNumber; count++) {

            int firstNum = Integer.parseInt(scanner.nextLine());
            FirstNumber.add(firstNum);
        }
        for (int count = 0; count < secondNumber; count++) {

            int secondNum = Integer.parseInt(scanner.nextLine());
            SecondNumber.add(secondNum);
        }
        for (Integer number : FirstNumber) {
            if (SecondNumber.contains(number)){
                System.out.print(number + " ");
            }
        }

    }
}
