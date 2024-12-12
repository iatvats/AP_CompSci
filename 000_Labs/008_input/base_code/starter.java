/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String FN = sc.nextLine();
        System.out.print("Enter your age: ");
        int A = sc.nextInt();
        System.out.print("Enter your birthday month: ");
        sc.nextLine();
        String BM = sc.nextLine();
        System.out.print("Enter your birthday day: ");
        int BD = sc.nextInt();
        System.out.print("Enter your birthday year: ");
        int BY = sc.nextInt();
        System.out.print("How much is a buck fifty? ");
        double BF = sc.nextDouble();
		System.out.println("First Name: " + FN);
		System.out.println("Age: " + A);
		System.out.println("Birthday: " + BM + " " + BD + " " + BY);
		System.out.println("Cost of a buck fifty: " + BF);
	}
}
