package Offensif;

import Board.Case;
import Personnage.Personnage;
import Personnage.Wizard;

import java.util.Scanner;

public abstract class Sort extends OffensifEquipement {
    public Sort(int attackLevel, String name) {
        super(attackLevel, name, "Sort");
    }
}


//    @Override
//    public int interaction(Personnage joueur) {
//
//        Scanner tour = new Scanner(System.in);
//        System.out.print("Voulez vous prendre l'arme? [y/n]");
//        String choice = tour.nextLine();
//        switch (choice) {
//            case "y":
//                joueur.setAttackObject(this);
//                return 1;
//            case "n":
//                System.out.println("Pas prendre l'arme");
//
//        }
//        return 2;
//
//
////        if (joueur instanceof Wizard) {
////            Scanner newCharacter = new Scanner(System.in);
////            System.out.print("Voulez vous prendre l'arme? [y/n]");
////            if (newCharacter.nextLine().equals("y")) {
////                joueur.setAttackObject(this);
////                return 1;
////            } else {
////                System.out.println("Pas prendre l'arme");
////                return 2;
////            }
////
////        } else {
////            System.err.println("Vous ne pouvez pas prendre cet objet, tu es un Guerrier " + joueur.getName());
////            return 2;
////        }
//
//    }



