package Defensif;

import Defensif.DefensifEquipement;

public class Philter extends DefensifEquipement {
    public Philter(int levelDefense, String name) {
        super("Philter", levelDefense, name);
    }

    public String toString() {
        return "type: Philter" + " " + "defenselevel: " + getLevelDefense() + " " + "nom du bouclier: " + getName();
    }
}
