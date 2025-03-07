import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = 1 + random.nextInt(100);
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100.");

        do {
            guess = scanner.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        } while (guess != numberToGuess);

        System.out.printf("You took %d attempts.%n", attempts);
        
    }
}