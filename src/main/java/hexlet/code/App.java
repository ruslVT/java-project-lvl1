package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GSD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String gameNumber = scanner.nextLine();

        switch (gameNumber) {
            case "1" ->
                Engine.greeting();
            case "2" ->
                EvenGame.game();
            case "3" ->
                CalcGame.game();
            case "4" ->
                GcdGame.game();
            case "5" ->
                Progression.game();
            default -> {
            }
        }
    }


}
