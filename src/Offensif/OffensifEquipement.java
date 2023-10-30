package Offensif;

import Board.Case;
import Personnage.Personnage;

import java.util.Scanner;

public abstract class OffensifEquipement implements Case {

    private String TypeWeapon;
    private int attackLevel;
    private String name;

    public OffensifEquipement(int attackLevel, String name, String typeWeapon) {
        this.attackLevel = attackLevel;
        this.name = name;
        this.TypeWeapon = typeWeapon;

    }

    @Override
    public int interaction(Personnage joueur) {
        if (joueur.getTypeWeapon().equals(this.TypeWeapon)) {
            Scanner tour = new Scanner(System.in);
            System.out.print("Voulez vous prendre l'arme? [y/n]");
            String choice = tour.nextLine();
            switch (choice) {
                case "y":
                    joueur.setAttackObject(this);
                    joueur.setTotalAttack(joueur.getAttackStrength()+this.getAttackLevel());
                    return 1;
                case "n":
                    System.out.println("Pas prendre l'arme");
                    return 2;
            }
        }
        return 2;
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

