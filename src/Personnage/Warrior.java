package Personnage;

import Offensif.EnumTypeWeapon;
import Offensif.OffensifEquipement;
import Offensif.Weapon;

public class Warrior extends Personnage {
    private String type = "Warrior";

    private OffensifEquipement Weapon;

    public Warrior(String name) {
        super(name, 5, 5, "Weapon");

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
