/*
 *	Author:  Michael Sargsyan 
 *  Date: 11/05/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
        BaseClass songArray = new BaseClass();
        
        songArray.populateLyrics();
        
        songArray.printLyrics();
    }
}