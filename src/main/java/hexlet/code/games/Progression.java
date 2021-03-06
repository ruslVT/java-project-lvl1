/*
 *           Game Progression
 *  Define element of progression
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {

    private static final int MAX_ROW_LENGTH = 11;  // Max progression length
    private static final int MIN_ROW_LENGTH = 5;  // Min progression length
    private static final int MAX_DIFF = 5;  // Progression difference
    private static final int MAX_FIRST_NUMBER = 20;  // Max number for first element
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void game() {

        // Array for questions and answers
        String[][] gameData = new String[Engine.COUNT_ROUNDS][Engine.DATA_PER_ROUND];

        for (int i = 0; i < gameData.length; i++) {
            int rowLength = RandomUtils.nextInt(MIN_ROW_LENGTH, MAX_ROW_LENGTH);
            int firstNumber = RandomUtils.nextInt(1, MAX_FIRST_NUMBER);
            int diff = RandomUtils.nextInt(1, MAX_DIFF);
            int[] row = progression(firstNumber, rowLength, diff);

            int missElement = row[RandomUtils.nextInt(0, row.length)];
            String question = "";

            // creating result string
            for (int num : row) {
                if (num == missElement) {
                    question += ".. ";
                } else {
                    question += num + " ";
                }
            }

            gameData[i][0] = question;
            gameData[i][1] = Integer.toString(missElement);
        }

        Engine.game(DESCRIPTION, gameData);  // Start game
    }

    // creating progression
    public static int[] progression(int firstNumber, int rowLength, int diff) {
        int[] row = new int[rowLength];

        for (int j = 0; j < row.length; j++) {
            row[j] = firstNumber + (diff * j);
        }

        return row;
    }
}
