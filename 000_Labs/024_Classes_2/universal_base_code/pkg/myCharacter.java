/*
 *	Author:  Michael Sargsyan
 *  Date: 10/17/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
    public String role;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int charisma;
    public myCharacter(String role, int strength, int dexterity, int intelligence, int charisma) {
        this.role = role;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }
}