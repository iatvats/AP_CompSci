/*
 *	Author:  Michael Sargsyan 
 *  Date: 11/19/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		
		
	}
    public void talkBack(String userInput) {
        System.out.println("\n\"Oh, really?\"" +
                           "\n\tYou said: \"" + userInput + "\"?" +
                           "\nthat's so... \"interesting\"." +
                           "\n\tYou must be so proud of yourself. \\Good job\\\n");
    }
}