package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class EvenGame {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    public static void game() {

        String requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] gameData = new String[Engine.getGameDataLength()];

        for (int i = 0; i < gameData.length; i += 2) {
            int randomNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = Integer.toString(randomNumber);
            gameData[i] = question;
            String answer = isEven(randomNumber) ? "yes" : "no";
            gameData[i + 1] = answer;
        }

        Engine.game(requirement, gameData);
    }


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
