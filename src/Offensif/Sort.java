package Offensif;

import Board.Case;
import Personnage.Personnage;
import Personnage.Wizard;

import java.util.Scanner;

public abstract class Sort extends OffensifEquipement implements Case {
    public Sort( int attackLevel, String name) {
        super("Sort", attackLevel, name);
    }

    @Override
    public void interaction(Personnage joueur) {
        if (joueur instanceof Wizard) {
            Scanner newCharacter = new Scanner(System.in);
            System.out.print("Voulez vous prendre l'arme? [y/n]");
            if (newCharacter.nextLine().equals("y")){
                joueur.setAttackObject(this);
            } else {
                System.out.println("Pas prendre l'arme");
            }

        } else {
            System.err.println("Vous ne pouvez pas prendre cet objet, tu es un Guerrier Harry, heuuu  " + joueur.getName());
        }
    }

}
