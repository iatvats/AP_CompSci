/*
 *	Author:  Michael Sargsyan
 *  Date: 12/03/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
        String fn = "Arnold Swagsaklsdfjslakfiurpqr";
        int spaceIndex = fn.indexOf(" ");
        System.out.println(spaceIndex);
        int length = fn.length();
        System.out.println(length);
        String ln = fn.substring(spaceIndex + 1, length);
        System.out.println(ln);
    }
}