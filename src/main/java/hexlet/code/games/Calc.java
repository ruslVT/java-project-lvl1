/*
 *           Game Calc
 *  Calculate expression with random operators
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class CalcGame {

    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_OPERATORS = 3;

    public static void game() {

        String requirement = "What is the result of the expression?";
        String[] gameData = new String[Engine.getGameDataLength()];  // Array for questions and answers

        for (int i = 0; i < gameData.length; i += 2) {
            char operator = randomOperator();
            int firstNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = firstNumber + " " + operator + " " + secondNumber;  // Question for data array
            gameData[i] = question;
            String answer = Integer.toString(calc(firstNumber, secondNumber, operator));  // Answer for data array
            gameData[i + 1] = answer;
        }

        Engine.game(requirement, gameData);  // Start game
    }

    // Calculate result of expression
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

    // Get random operator
    public static char randomOperator() {
        char[] operators = {'+', '-', '*'};
        return operators[RandomUtils.nextInt(0, MAX_OPERATORS)];
    }
}
