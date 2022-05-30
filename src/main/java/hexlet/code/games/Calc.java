/*
 *           Game Calc
 *  Calculate expression with random operators
 */

package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {

    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void game() {

        String[][] gameData = new String[Engine.getCountRounds()][2];  // Array for questions and answers

        for (int i = 0; i < gameData.length; i++) {
            char operator = randomOperator();
            int firstNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondNumber = RandomUtils.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String question = firstNumber + " " + operator + " " + secondNumber;  // Question for data array
            gameData[i][0] = question;
            String answer = Integer.toString(calc(firstNumber, secondNumber, operator));  // Answer for data array
            gameData[i][1] = answer;
        }

        Engine.game(DESCRIPTION, gameData);  // Start game
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
        return OPERATORS[RandomUtils.nextInt(0, OPERATORS.length)];
    }
}
