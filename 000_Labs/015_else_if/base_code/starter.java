/*
 *	Author:  Michael Sargsyan 
 *  Date: 09/25/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
 Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            int t = random.nextInt(1000) + 1;
            int g;
            System.out.println("Guess a number between 1 and 1000:");
            do {
                g = scanner.nextInt();
                System.out.println(g < t ? "Too low" : g > t ? "Too high" : "Correct");
            } while (g != t);
            System.out.println("You guessed");
        } while (true);
    }
}