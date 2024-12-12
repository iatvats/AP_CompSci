/*
 *	Author:  Micahel Sargsyan 
 *  Date: 10/16/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    static class Character {
        String role;
        int strength;
        int dexterity; 
        int intelligence;
        int charisma; 
        public Character(String role, int strength, int dexterity, int intelligence, int charisma) {
            this.role = role;
            this.strength = strength;
            this.dexterity = dexterity;
            this.intelligence = intelligence;
            this.charisma = charisma;
        }
    }
    public static void main(String[] args) {
        Character character = new Character("Wizard", 1, 2, 8, 6);
        System.out.println("Role: " + character.role);
        System.out.println("Strength: " + character.strength);
        System.out.println("Dexterity: " + character.dexterity);
        System.out.println("Intelligence: " + character.intelligence);
        System.out.println("Charisma: " + character.charisma);
    }
}