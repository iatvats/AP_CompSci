/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random random = new Random();
        int r1 = random.nextInt(10);
        System.out.println("Random integer (0 to 9): " + r1);
        int r2 = random.nextInt(100) + 1; 
        System.out.println("Random integer (1 to 100): " + r2);
        double r3 = 2.5 + (random.nextDouble() * (3.5 - 2.5));
        System.out.printf("Random double (2.5 to 3.5): %.2f%n", r3);
        double r4 = 14 + (random.nextDouble() * (589 - 14));
        System.out.printf("Random double (14 to 589): %.2f%n", r4);
	}
}
