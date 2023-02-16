package PractiseProject.Ready1;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfGuess = 0;

        System.out.println("Tell me what number i am think , it is between 1 and 150. \n Can you please guess the number?");

        while (true) {
            System.out.println("Enter your guess: ");
            int guess = input.nextInt();
            numberOfGuess++;
            if (guess == numberToGuess) {
                System.out.println("Congratulations your gueesed it right");
                System.out.println("it only took you" + numberOfGuess + " Guesses");

                break;
            }
            else if (guess<numberToGuess) {
                System.out.println(" Too low try again");
            }
            else {
                System.out.println(" Too high try again");
            }
        }
    }
}
