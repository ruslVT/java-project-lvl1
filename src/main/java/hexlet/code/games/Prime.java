/*
 *           Game Prime
 *   Define is random number prime or not
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class PrimeGame {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;

    public static void game() {

        String requirement = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] gameData = new String[Engine.getGameDataLength()];  // Array for questions and answers

        // Generate data for several rounds
        for (int i = 0; i < gameData.length; i += 2) {
            int randomNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = Integer.toString(randomNumber);  // Question for data array
            gameData[i] = question;
            String answer = isPrime(randomNumber);  // Answer for data array
            gameData[i + 1] = answer;
        }

        Engine.game(requirement, gameData);  // Start game
    }

    // Define is number prime or not. Return Strings "yes" or "no"
    public static String isPrime(int num) {

        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return "no";
                }
            }
            return "yes";
        }
        return "no";
    }

}
