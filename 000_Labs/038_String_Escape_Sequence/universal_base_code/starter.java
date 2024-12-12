/*
 *	Author:  Michael Sargsyan 
 *  Date: 11/19/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell somethin ");
        String userInput = sc.nextLine();
        test.talkBack(userInput);

        sc.close();
    }
}