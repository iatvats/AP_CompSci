/*
 *	Author: Michael Sargsyan 
 *  Date:09/30/2024
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
        System.out.print("First integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Second integer: ");
        int n2 = scanner.nextInt();
        if (n1 % 2 == 0) {
            System.out.println(n1 + " is even.");
        } else {
            System.out.println(n1 + " is odd.");
        }
        if (n1 % 3 == 0 && n1 % 4 == 0 && n1 % 5 == 0) {
            System.out.println(n1 + " is divisible by 3, 4, and 5.");
        } else {
            System.out.println(n1 + " is not divisible by 3, 4, and 5.");
        }
        if (n2 % 2 == 0) {
            System.out.println(n2 + " is even.");
        } else {
            System.out.println(n2 + " is odd.");
        }
        if (n2 % 3 == 0 && n2 % 4 == 0 && n2 % 5 == 0) {
            System.out.println(n2 + " is divisible by 3, 4, and 5.");
        } else {
            System.out.println(n2 + " is not divisible by 3, 4, and 5.");
        }
    }
}