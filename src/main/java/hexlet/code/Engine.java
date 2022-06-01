/*
 *      Engine for games
 */

package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int COUNT_ROUNDS = 3;
    public static final int DATA_PER_ROUND = 2;  // 1 - question, 2 - answer.

    // Game engine
    public static void game(String requirement, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(requirement);

        for (String[] row : gameData) {
            System.out.println("Question: " + row[0]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(row[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + row[1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
        scanner.close();
    }

}
