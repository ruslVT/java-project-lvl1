package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;

    public static void game() {

        String requirement = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] gameData = new String[Engine.getGameDataLength()];  // Array with question and answer for 3 round

        // Generate data for game
        for (int i = 0; i < gameData.length; i += 2) {
            int randomNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = Integer.toString(randomNumber);  // Question for data array
            gameData[i] = question;
            String answer = isPrime(randomNumber);  // Answer for data array
            gameData[i + 1] = answer;
        }

        Engine.game(requirement, gameData);  // Start game
    }

    // Define is number prime or not
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
