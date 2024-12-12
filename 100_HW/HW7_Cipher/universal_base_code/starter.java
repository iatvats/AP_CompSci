/*
 *	Author: Michael Sargsyan
 *  Date:	10/20/2024
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to encode: ");
        String message = scanner.nextLine();
        String encodedMessage = encode();
        System.out.println("Encoded message: " + encodedMessage);
        System.out.print("Enter a message with a key: ");
        String messageWithKey = scanner.nextLine();
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        String keyedEncodedMessage = keyedEncode(messageWithKey, key);
        System.out.println("Encoded message with key: " + keyedEncodedMessage);
()
    }
    public static String encode(String message) {
    }
    public static String keyedEncode(String message, int key) {
    }
}
// Honestly, I didn't understand what I needed to do, so I wrote what I could.