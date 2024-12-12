/*
 *	Author:  Michael Sargsyan
 *  Date: 11/05/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
    String[] song = new String[10];

    public void populateLyrics() {
        song[0] = "Through it all once again";
        song[1] = "Came to know my only friend";
        song[2] = "Lost control";
        song[3] = "Can't begin, I seek within";
        song[4] = "To feel the warmth brought within your skin";
        song[5] = "Did you know?";
        song[6] = "For how it seemed";
        song[7] = "I should've stayed and let you be";
        song[8] = "Run into my heart so carelessly";
        song[9] = "That's the reason I'm afraid";
    }

    public void printLyrics() {
        for (int i = 0; i < song.length; i++) {
            System.out.println(song[i]);
        }
    }
}