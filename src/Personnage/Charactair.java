package Personnage;

import Defensif.DefensifEquipement;
import Offensif.OffensifEquipement;

public abstract class Charactair {
    private String name;
//    private String type;
    private int life;
    private int MaxLife = 15;
    private int attackStrength;
    private int playerPosition;
    private OffensifEquipement attackObject;
    private DefensifEquipement defenseObject;

    public Charactair() {
    }

    public Charactair(String name) {
        this.name = name;
    }




    public Charactair(String name, int life, int attackStrength) {
        this.name = name;
        this.life = life;
        this.attackStrength = attackStrength;
//        this.attackObject = new OffensifEquipement(TypeWeapon, int attackLevel, String name);
    }
    public abstract String getType();


    @Override
    public String toString() {
        return "◇─◇──◇────◇ INFOS JOUEUR ◇─────◇──◇─◇" + '\n' +
                "name: " + name + '\n' +
                "type: " + getType() + '\n' +
                "life: " + life + '\n' +
                "attackStrength: " + attackStrength + '\n' +
                 attackObject + '\n' +
                 defenseObject+ '\n' ;
    }


    public OffensifEquipement getAttackObject() {
        return attackObject;
    }
    public void setAttackObject(OffensifEquipement attackObject) {
        this.attackObject = attackObject;
    }
    public DefensifEquipement getDefenseObject() {
        return defenseObject;
    }
    public void setDefenseObject(DefensifEquipement defenseObject) {
        this.defenseObject = defenseObject;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
            this.life = life;
    }
    public int getAttackStrength() {
        return attackStrength;
    }
    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }
    public int getPlayerPosition() {
        return playerPosition;
    }
    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
    public int getMaxLife() {
        return MaxLife;
    }
    public void setMaxLife(int maxLife) {
        MaxLife = maxLife;
    }
}
