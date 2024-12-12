/*
 *	Author: Michael Sargsyan 
 *  Date: 10/07/2024
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
class starter {
	 public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int b = 100;
        while (b > 0) {
            System.out.println("Your balance: $" + b);
            System.out.print("Enter your bid: ");
            int bid = scanner.nextInt();
            if (bid > b || bid <= 0) {
                System.out.println("Invalid bid. Try again.");
                continue;
            }
            int s1 = random.nextInt(10) + 1;
            int s2 = random.nextInt(10) + 1;
            int s3 = random.nextInt(10) + 1;
            System.out.println("Rolled: " + s1 + " " + s2 + " " + s3);

            if (s1 == s2 && s2 == s3) {
                b += bid * 2; 
                System.out.println("Jackpot! You won.");
            } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                b += bid;
                System.out.println("You doubled your wager.");
            } else {
                b -= bid;
                System.out.println("You lost your wager.");
            }

            if (b > 0) {
                System.out.print("Play again? (yes or no): ");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("no")) break;
            }
        }

        System.out.println("Your final balance: $" + b);
        scanner.close();
    }
}