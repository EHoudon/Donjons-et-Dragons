package Personnage;

import Defensif.DefensifEquipement;
import Offensif.OffensifEquipement;
import Offensif.Weapon;

public abstract class Personnage {
    private String name;
//    private String type;
    private int life;
    private int MaxLife = 10;
    private int attackStrength;
    private int totalAttack;
    private int playerPosition;
    private OffensifEquipement attackObject;
    public String TypeWeapon;
    private DefensifEquipement defenseObject;

    public Personnage() {
    }
    public Personnage(String name) {
        this.name = name;
    }

    /**
     *
     * @param name
     * @param life
     * @param attackStrength
     * @param typeWeapon
     */
    public Personnage(String name, int life, int attackStrength, String typeWeapon) {
        this.name = name;
        this.life = life;
        this.attackStrength = attackStrength;
        this.TypeWeapon = typeWeapon;

    }
    public abstract String getType();

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "◇─◇──◇────◇ INFOS JOUEUR ◇─────◇──◇─◇" + '\n' +
                "name: " + name + '\n' +
                "type: " + getType() + '\n' +
                "life: " + life + '\n' +
                "attackStrength: " + attackStrength + '\n' +
                "totalAttack: " + totalAttack + '\n' +
                 attackObject + '\n' +
                 defenseObject+ '\n' ;
    }

    public int getTotalAttack() {
        return totalAttack;
    }
    public void setTotalAttack(int totalAttack) {
        this.totalAttack = totalAttack;
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
