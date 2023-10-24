package Offensif;

import Board.Case;
import Character.*;

public abstract class Weapon extends OffensifEquipement implements Case {


    public Weapon(int attackLevel, String name) {
        super("Weapon", attackLevel, name);
    }



}

