package Offensif;

import Offensif.OffensifEquipement;

public class Weapon extends OffensifEquipement {


    public Weapon(int attackLevel, String name) {
        super("Weapon", attackLevel, name);
    }


//    public String toString() {
//        return "type: Weapon" + " " + "attacklevel: " + getAttackLevel() + " " + "nom de l'arme: " + getName();
//    }
}
