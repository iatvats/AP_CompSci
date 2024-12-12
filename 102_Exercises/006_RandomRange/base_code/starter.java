/*
 *	Author: Michael Sargsyan 
 *  Date: 09/16/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers to create a range for your random number");
			System.out.println("Please enter an integer: ");
    		int numb1 = sc.nextInt();
    		System.out.println("Please enter another integer (bigger than the first): ");
    		int numb2 = sc.nextInt();
    		System.out.println("Your range is " +  numb1 + " to " +  numb2);
    		System.out.println("Here are 5 numbers generated in that range.");
    		System.out.println((int)(Math.random()*(numb2-numb1)) + numb1);
    		System.out.println((int)(Math.random()*(numb2-numb1)) + numb1);
    		System.out.println((int)(Math.random()*(numb2-numb1)) + numb1);
    		System.out.println((int)(Math.random()*(numb2-numb1)) + numb1);
    		System.out.println((int)(Math.random()*(numb2-numb1)) + numb1);
    		
    		
    		
		
	}
}
