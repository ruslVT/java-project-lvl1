package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GcdGame {

    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MIN_RANDOM_NUMBER = 1;

    public static void game() {

        String requirement = "Find the greatest common divisor of given numbers.";
        String[] gameData = new String[Engine.getGameDataLength()];

        for (int i = 0; i < gameData.length; i += 2) {
            int firstNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = firstNumber + " " + secondNumber;
            gameData[i] = question;
            int result = gcd(firstNumber, secondNumber);
            gameData[i + 1] = Integer.toString(result);
        }

        Engine.game(requirement, gameData);
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
