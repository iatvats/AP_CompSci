/*
 *	Author:  Michael Sargsyan 
 *  Date: 11/21/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("word:");
        String userWord = sc.nextLine();
        test.printW(userWord);
    }
}