/*
 *	Author:  Michael Sargsyan
 *  Date: 09/24/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	    Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(1000) + 1;
        int g = 0; 
        System.out.println("Guess a number between 1 and 1000:");
        do {
            g = scanner.nextInt();
            if (g < n) {
                System.out.println("Too low, try again.");
            } else if (g > n) {
                System.out.println("Too high, try again.");
            }
        } while (g != n);
        System.out.println("You guessed the number!");
    }
}