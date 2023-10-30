package Personnage;

import Offensif.OffensifEquipement;
import Offensif.Sort;

public class Wizard extends Personnage {
    private String type = "Wizard";

    private OffensifEquipement Sort;

    public Wizard(String name){
        super(name,3,8,"Sort");
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}

