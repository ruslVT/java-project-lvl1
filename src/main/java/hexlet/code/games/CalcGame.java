package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class CalcGame {

    public static void game() {
        String requirement = "What is the result of the expression?";
        String[] gameData = new String[Engine.getGameDataLength()];

        for (int i = 0; i < gameData.length; i += 2) {
            char operator = randomOperator();
            int firstNumber = Engine.random();
            int secondNumber = Engine.random();
            String question = firstNumber + " " + operator + " " + secondNumber;
            gameData[i] = question;
            String answer = Integer.toString(calc(firstNumber, secondNumber, operator));
            gameData[i + 1] = answer;
        }

        Engine.game(requirement, gameData);
    }

    public static int calc(int firstNumber, int secondNumber, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                result = 0;
        }
        return result;
    }

    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        return operators[RandomUtils.nextInt(0, 2)];
    }
}
