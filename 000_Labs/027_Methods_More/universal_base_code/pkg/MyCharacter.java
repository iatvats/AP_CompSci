/*
 *	Author:  Micahael Sargsyan
 *  Date: 10/24/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
    public String role;
    public int str, dex, intell, charm;
    public String setRole(String newRole) {
        role = newRole;
        return role;
    }
    public int setStr(int newStr) {
        str = (newStr < 0) ? 0 : newStr;
        return str;
    }
    public int setDex(int newDex) {
        dex = (newDex < 0) ? 0 : newDex;
        return dex;
    }
    public int setIntell(int newIntell) {
        intell = (newIntell < 0) ? 0 : newIntell;
        return intell;
    }
    public int setCharm(int newCharm) {
        charm = (newCharm < 0) ? 0 : newCharm;
        return charm;
    }
    public boolean setAll(String role, int str, int dex, int intell, int charm) {
        setRole(role);
        setStr(str);
        setDex(dex);
        setIntell(intell);
        setCharm(charm);
        return true; 
    }
    public String toString() {
        return "Role: " + role + ", Strength: " + str + ", Dexterity: " + dex + ", Intelligence: " + intell + ", Charisma: " + charm;
    }
}