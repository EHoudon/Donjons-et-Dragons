package Offensif;

import Board.Case;
import Personnage.Personnage;
import Personnage.Warrior;

import java.util.Scanner;

public abstract class Weapon extends OffensifEquipement {

    private String TypeWeapon;

    public Weapon(int attackLevel, String name) {
        super(attackLevel, name, "Weapon" );
    }



    @Override
    public String getTypeWeapon() {
        return TypeWeapon;
    }

    @Override
    public void setTypeWeapon(String typeWeapon) {
        TypeWeapon = typeWeapon;
    }
}

//}

