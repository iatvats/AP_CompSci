/*
 *	Author: Michahel Sargsyan 
 *  Date:	10/13/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int mn = scanner.nextInt();
        printPrimes(mn);
    }
    public static boolean checkPrime(int n) {
        int i = 2;
        if (n <= 1) {
            return false;
        }
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void printPrimes(int mn) {
        int n = 2;

        while (n < mn) {
            if (checkPrime(n)) {
                System.out.println(n);
            }
            n++;
        }
    }
}