/*
 *	Author:  Michael Sargsyan 
 *  Date: 09/26/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner scanner = new Scanner(System.in);
        System.out.println("Choose: Wizard, Warrior, or Rogue:");
        String role = scanner.nextLine();
        if (role.equals("Wizard")) {
            System.out.println("You have chosen the role of Wizard");
        } else if (role.equals("Warrior")) {
            System.out.println("You have chosen the role of Warrior");
        } else if (role.equals("Rogue")) {
            System.out.println("You have chosen the role of Rogue");
        } else {
            System.out.println("Invalid input");
        }
    }
}