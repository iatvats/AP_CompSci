/*
 *	Author:  Michael Sargsyan
 *  Date: 10/02/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("How many times? ");
        int times = scanner.nextInt();
        int count = 0;
        while (count < times) {
            System.out.println(name);
            count++;
        }

    }
}