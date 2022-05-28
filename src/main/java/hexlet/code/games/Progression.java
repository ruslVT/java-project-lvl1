/*
 *           Game Progression
 *  Define element of progression
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    private static final int MAX_ROW_LENGTH = 11;  // Max progression length
    private static final  int MIN_ROW_LENGTH = 5;  // Min progression length
    private static final int MAX_INTERVAL = 5;  // Interval progression
    private static final int MAX_FIRST_NUMBER = 20;  // Max number for first element

    public static void game() {

        String requirement = "What number is missing in the progression?";
        String[] gameData = new String[Engine.getGameDataLength()];  // Array for questions and answers

        for (int i = 0; i < gameData.length; i += 2) {
            int rowLength = RandomUtils.nextInt(MIN_ROW_LENGTH, MAX_ROW_LENGTH);
            int hiddenElement = RandomUtils.nextInt(1, rowLength);
            int elementValue = RandomUtils.nextInt(1, MAX_FIRST_NUMBER);
            int elementRange = RandomUtils.nextInt(1, MAX_INTERVAL);
            String question = "";
            String result = "";

            // Generate question and answer for data array
            for (int j = 0; j < rowLength; j++) {
                if (j == hiddenElement) {
                    question += ".. ";
                    result = Integer.toString(elementValue);  // Answer for data array
                } else {
                    question += elementValue + " ";
                }

                elementValue += elementRange;
            }

            gameData[i] = question;
            gameData[i + 1] = result;
        }

        Engine.game(requirement, gameData);  // Start game
    }
}
