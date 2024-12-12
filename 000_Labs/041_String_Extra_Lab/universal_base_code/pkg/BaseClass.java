/*
 *	Author:  Michael Sargsyan
 *  Date: 12/05/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		
    }
   public void reversePhrase(String phrase) {
        String reversed = "";
        String word = "";

        for (int i = phrase.length() - 1; i >= 0; i--) {
            char c = phrase.charAt(i);
            if (c == ' ' || i == 0) {
                if (i == 0) {
                    word = c + word;
                }
                reversed = reversed + word + " ";
                word = "";
            } else {
                word = c + word; 
            }
        }

        System.out.println(reversed.trim());
    }
}
