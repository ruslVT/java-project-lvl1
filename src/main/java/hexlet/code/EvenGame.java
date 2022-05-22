package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    private static final int MAX_RANDOM_NUMBER = 99;
    private static final int QUESTION_MAX = 3;


    public static void game() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int questionCount = 0;

        while (questionCount < QUESTION_MAX) {
            questionCount++;
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");

            String response = scanner.nextLine();

            if (response.equals("yes") && isEven(randomNumber)) {
                System.out.println("Correct!");
            } else if ((!response.equals("yes")) && isEven(randomNumber)) {
                System.out.println("'" + response + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + App.getPlayerName() + "!");
                break;
            } else if (response.equals("no") && !isEven(randomNumber)) {
                System.out.println("Correct!");
            } else if (!response.equals("no") && !isEven(randomNumber)) {
                System.out.println("'" + response + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + App.getPlayerName() + "!");
                break;
            }

            if (questionCount == QUESTION_MAX) {
                System.out.println("Congratulations, " + App.getPlayerName() + "!");
            }
        }

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
