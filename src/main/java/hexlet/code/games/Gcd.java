/*
 *           Game GCD
 *  Define greatest common divisor for two numbers
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Gcd {

    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void game() {

        String[][] gameData = new String[Engine.getCountRounds()][2];  // Array for questions and answers

        for (int i = 0; i < gameData.length; i++) {
            int firstNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = firstNumber + " " + secondNumber;  // Question for data array
            gameData[i][0] = question;
            int result = gcd(firstNumber, secondNumber);  // Answer for data array
            gameData[i][1] = Integer.toString(result);
        }

        Engine.game(DESCRIPTION, gameData);
    }

    // Define GCD
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
