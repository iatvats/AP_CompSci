/*
 *	Author:  Michael Sargsyan 
 *  Date:	09/11/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = s.nextDouble();
        double celsius = (f - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
	}
}
