package Offensif;

import Board.Case;
import Personnage.Charactair;
import Personnage.Warrior;

import java.util.Scanner;

public abstract class Weapon extends OffensifEquipement implements Case {


    public Weapon(int attackLevel, String name) {
        super("Weapon", attackLevel, name);
    }

    @Override
    public void interaction(Charactair joueur) {
        if (joueur instanceof Warrior) {
            Scanner newCharacter = new Scanner(System.in);
            System.out.print("Voulez vous prendre l'arme? [y/n]");
            if (newCharacter.nextLine().equals("y")){
                joueur.setAttackObject(this);
            } else {
                System.out.println("Pas prendre l'arme");
            }

        } else {
            System.err.println("Vous ne pouvez pas prendre cet objet, tu es un sorcier Harry, heuuu   " + joueur.getName());
        }
    }

}

