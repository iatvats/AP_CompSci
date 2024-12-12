/*
 *	Author:   Michael Sargsyan
 *  Date: 11/14/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
        ArrayList<Warrior> warriors = new ArrayList();
        ArrayList<Wizard> wizards = new ArrayList();
        for (int i = 0; i < 100; i++) {
            warriors.add(new Warrior("warrior" + (i + 1)));
            wizards.add(new Wizard("wizard" + (i + 1)));
        }
        int warriorIndex = 0;
        int wizardIndex = 0;
        while (warriorIndex < warriors.size() && wizardIndex < wizards.size()){
            Warrior currentWarrior = warriors.get(warriorIndex);
            Wizard currentWizard = wizards.get(wizardIndex);
            if (!currentWizard.isDead()) {
                currentWizard.attack(currentWarrior);
            }
            if (currentWarrior.isDead()) {
                System.out.println(currentWarrior.getName() + "died.");
                warriorIndex++;
                continue;
            }
            currentWarrior.attack(currentWizard);
            if (currentWizard.isDead()) {
                System.out.println(currentWizard.getName() + "died.");
                wizardIndex++;
            }
        }
        if (warriorIndex >= warriors.size()) {
            System.out.println("wizards win, remaining Wizards: " + (wizards.size() - wizardIndex));
        } else {
            System.out.println("warriors win, remaining Warriors: " + (warriors.size() - warriorIndex));
        }
    }
}