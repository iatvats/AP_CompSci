/*
 *	Author:  Michael Sargsyan 
 *  Date: 12/05/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
        Scanner sc = new Scanner(System.in);
        BaseClass helper = new BaseClass();

        System.out.print("Write sentence: ");
        String phrase = sc.nextLine();

        System.out.println(phrase);
        helper.reversePhrase(phrase);
}
}