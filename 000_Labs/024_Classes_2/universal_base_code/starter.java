/*
 *	Author:  Michael Sargsyan
 *  Date: 10/16/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
        myCharacter character = new myCharacter("Wizard", 2, 3, 5, 4);
        System.out.println("Role: " + character.role);
        System.out.println("Strength: " + character.strength);
        System.out.println("Dexterity: " + character.dexterity);
        System.out.println("Intelligence: " + character.intelligence);
        System.out.println("Charisma: " + character.charisma);
    }
}