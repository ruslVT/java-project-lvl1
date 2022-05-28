package hexlet.code;

import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

public class Engine {

    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_ROUNDS = 3;
    private static final int GAME_DATA_LENGTH = 6;
    private static String playerName;

    public static int getGameDataLength() {
        return GAME_DATA_LENGTH;
    }

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static String playersAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }

    public static void wrongAnswer(String playersAnswer, String correctAnswer) {
        System.out.println("'" + playersAnswer + "' is wrong answer ;(. Correct answer was " + correctAnswer + ".");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static int random() {
        return RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    }

    public static void game(String requirement, String[] gameData) {
        greeting();
        System.out.println(requirement);

        int index = 0;
        for (int i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + gameData[index]);
            String answer = playersAnswer();
            if (answer.equals(gameData[index + 1])) {
                System.out.println("Correct!");
            } else {
                wrongAnswer(answer, gameData[index + 1]);
                break;
            }

            index += 2;
            if (index == (gameData.length)) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }

    }

}
