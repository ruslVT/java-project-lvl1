package hexlet.code;

import java.util.Scanner;

public class App {
    private static String playerName;

    public static String getPlayerName() {
        return playerName;
    }

    public static void main(String[] args) {
        int gameNumber = App.gameMenu();

        switch (gameNumber) {
            case 1 ->
                App.greeting();
            case 2 -> {
                App.greeting();
                EvenGame.game();
            }
            default -> {
            }
        }
    }

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games");
        System.out.print("May I have your name? ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static int gameMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        return scanner.nextInt();
    }
}
