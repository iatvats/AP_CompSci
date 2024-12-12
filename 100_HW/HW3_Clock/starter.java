/*
 *	Author: Michael Sargsyan 
 *  Date:	09/21/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day (0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday): ");
        int day = scanner.nextInt();

        if (day == 0 || day == 6) {
            System.out.println("Wake up at 10:00");
        } else if (day >= 1 && day <= 5) {
            System.out.println("Wake up at 7:00");
    }
}
}