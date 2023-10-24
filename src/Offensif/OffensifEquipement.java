package Offensif;

import Board.Case;

public abstract class OffensifEquipement implements Case {

    private String TypeWeapon;
    private int attackLevel;
    private String name;
    public OffensifEquipement(String TypeWeapon, int attackLevel, String name) {
        this.TypeWeapon = TypeWeapon;
        this.attackLevel = attackLevel;
        this.name = name;

    }

    @Override
    public String toString() {
        return "▂▃▅▇█▓▒░ Offensif Equipement ░▒▓█▇▅▃▂" + '\n' +
                "Type :" + TypeWeapon + '\n' +
                "attackLevel: " + attackLevel + '\n' +
                "name: " + name + '\n';
    }

    public String getTypeWeapon() {
        return TypeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        TypeWeapon = typeWeapon;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

