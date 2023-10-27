package Offensif;

import Board.Case;
import Personnage.Personnage;
import Personnage.Warrior;

import java.util.Scanner;

public abstract class Weapon extends OffensifEquipement implements Case {


    public Weapon(int attackLevel, String name) {
        super("Weapon", attackLevel, name);
    }

    @Override
    public int interaction(Personnage joueur) {
        if (joueur instanceof Warrior) {
            Scanner newCharacter = new Scanner(System.in);
            System.out.print("Voulez vous prendre l'arme? [y/n]");
            if (newCharacter.nextLine().equals("y")) {
                joueur.setAttackObject(this);
                return 1;
            } else {
                System.out.println("Pas prendre l'arme");
                return 2;
            }
        } else {
            System.err.println("Vous ne pouvez pas prendre cet objet, tu es un sorcier " + joueur.getName());
            return 2;
        }

    }

}

