/*
   * Author: Michael Sargsyan 
   * Date: 12/08/2024
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0))) {
                result += words[i] + "way";
            } else {
                result += words[i].substring(1) + words[i].charAt(0) + "ay";
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }
        System.out.println(result);
    }
    public static boolean isVowel(char c) {
        char lC = Character.toLowerCase(c);
        return lC == 'a' || lC == 'e' || lC == 'i' || lC == 'o' || lC == 'u';
    }
}