/*
 *           Game Even
 *  Define is number even or not
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class EvenGame {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    public static void game() {

        String requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] gameData = new String[Engine.getGameDataLength()];  // Array for questions and answers

        // Generate data for several rounds
        for (int i = 0; i < gameData.length; i += 2) {
            int randomNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = Integer.toString(randomNumber);  // Question for data array
            gameData[i] = question;
            String answer = isEven(randomNumber) ? "yes" : "no";  // Answer for data array
            gameData[i + 1] = answer;
        }

        Engine.game(requirement, gameData);  // Start game
    }

    // Define even number or not
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
