/*
 *           Game Prime
 *   Define is random number prime or not
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {

        String[][] gameData = new String[Engine.getCountRounds()][2];  // Array for questions and answers

        // Generate data for several rounds
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = Integer.toString(randomNumber);  // Question for data array
            gameData[i][0] = question;
            String answer = isPrime(randomNumber) ? "yes" : "no";  // Answer for data array
            gameData[i][1] = answer;
        }

        Engine.game(DESCRIPTION, gameData);  // Start game
    }

    // Define is number prime or not.
    public static boolean isPrime(int num) {

        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
