/*
 *           Game Even
 *  Define is number even or not
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {

        // Array for questions and answers
        String[][] gameData = new String[Engine.COUNT_ROUNDS][Engine.DATA_PER_ROUND];

        // Generate data for several rounds
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = Integer.toString(randomNumber);  // Question for data array
            gameData[i][0] = question;
            String answer = randomNumber % 2 == 0 ? "yes" : "no";  // Answer for data array
            gameData[i][1] = answer;
        }

        Engine.game(DESCRIPTION, gameData);  // Start game
    }
}
