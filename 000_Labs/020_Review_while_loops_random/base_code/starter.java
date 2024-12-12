/*
 *	Author:  10/03/2024
 *  Date: Michael Sargsyan
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
        int guess;
        int number;
        Random r = new Random();
        number = r.nextInt(1000) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 1000.");
        while (true) {
            System.out.print("Guess: ");
            guess = input.nextInt();
            if (guess < number) {
                System.out.println("Too low, try again.");
            } else if (guess > number) {
                System.out.println("Too high, try again.");
            } else {
                break;
            }
        }

        System.out.println("You guessed the number: " + number);

    }
}