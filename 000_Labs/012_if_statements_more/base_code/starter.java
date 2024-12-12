/*
 *	Author: Michael Sargsyan 
 *  Date:	09/19/2024
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
        if (n1 == n2) {
            System.out.println("Two numbers are equal.");
        } else {
            System.out.println("Two numbers are different.");
        }
	}
}
