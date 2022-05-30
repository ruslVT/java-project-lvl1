/*
 *      Engine for games
 */

package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int COUNT_ROUNDS = 3;

    public static int getCountRounds() {
        return COUNT_ROUNDS;
    }

    // Game engine
    public static void game(String requirement, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(requirement);

        int index = 0;
        for (String[] row : gameData) {
            System.out.println("Question: " + row[0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(row[1])) {
                System.out.println("Correct!");
                index += 1;
                if (index == COUNT_ROUNDS) {
                    System.out.println("Congratulations, " + playerName + "!");
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + row[1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }

        scanner.close();
    }

}
