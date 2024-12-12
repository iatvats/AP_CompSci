/*
 *	Author:  Michael Sargsyan 
 *  Date: 09/26/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter characters name: ");
        String n = scanner.nextLine();
        System.out.print("Enter characters title: ");
        String t = scanner.nextLine();
        System.out.print("Choose role (Wizard, Warrior, Rogue): ");
        String r = scanner.nextLine();
        int totalPoints = 20, strength = 0, dexterity = 0, intelligence = 0, charisma = 0;
        while (totalPoints > 0) {
            System.out.println("Points left: " + totalPoints);
            System.out.print("Points to srength (max 5): ");
            int str = scanner.nextInt();
            System.out.print("Points to dexterity (max 5): ");
            int dex = scanner.nextInt();
            System.out.print("Points to intelligence (max 5): ");
            int intl = scanner.nextInt();
            System.out.print("Points to charisma (max 5): ");
            int cha = scanner.nextInt();
            if (str + dex + intl + cha > totalPoints || str > 5 || dex > 5 || intl > 5 || cha > 5) {
            System.out.println("Invalid allocation " + totalPoints);
            strength += str; 
            dexterity += dex; 
            intelligence += intl; 
            charisma += cha;
            totalPoints -= (str + dex + intl + cha);
        	System.out.println("Name: " + n);
        	System.out.println("Title: " + t);
    		System.out.println("Role: " + r);
        	System.out.println("Strength: " + strength);
        	System.out.println("Dexterity: " + dexterity);
        	System.out.println("Intelligence: " + intelligence);
    		System.out.println("Charisma: " + charisma);
        	if (totalPoints > 0) {
            System.out.println("Unused points: " + totalPoints);
        	}
	}
// i don't know why but the console doesn't show the code changes i make so i don't know if this code works at all but i did the best i could (sorry if google translate doesn't make it clear what i mean)