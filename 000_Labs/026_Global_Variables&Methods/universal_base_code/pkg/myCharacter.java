/*
 *	Author:  Micahel Sargsyan
 *  Date: 10/23/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
    String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;
    public myCharacter(String role, int strength, int dexterity, int intelligence, int charisma) {
        this.role = role;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
    public void myToString() {
        System.out.println("Role: " + role);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
    }
}