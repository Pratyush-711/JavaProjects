import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between 1 and 100.");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                break;
            }
            if(attempts >= MAX_ATTEMPTS){
                System.out.println("You have run out of attempts. The number was " + numberToGuess + ".");
                break;
            }

        } while (guess != numberToGuess);

        scanner.close();
    }
}
