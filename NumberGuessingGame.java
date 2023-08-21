import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int targetNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < targetNumber) {
                System.out.println("Try higher!");
            } else if (guess > targetNumber) {
                System.out.println("Try lower!");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
            }
        } while (guess != targetNumber);
        
        scanner.close();
    }
}
