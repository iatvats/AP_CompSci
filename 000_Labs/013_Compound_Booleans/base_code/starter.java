/*
 *	Author:  Michael Sargsyan 
 *  Date: 09/24/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int l = n1;
        if (n2 > l) l = n2;
        if (n3 > l) l = n3;
        int s = n1;
        if (n2 < s) s = n2;
        if (n3 < s) s = n3;
        System.out.println("Largest integer: " + l);
        System.out.println("Smallest integer: " + s);

    }
}