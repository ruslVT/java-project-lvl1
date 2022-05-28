package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    public static void game() {

        String requirement = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] gameData = new String[Engine.getGameDataLength()];

        for (int i = 0; i < gameData.length; i += 2) {
            int randomNumber = Engine.random();
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
