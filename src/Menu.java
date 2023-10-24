import java.util.Scanner;

import Character.Charactair;
import Character.Warrior;
import Character.Wizard;
import Defensif.Philter;
import Defensif.Shield;
import Offensif.Sort;
import Offensif.Weapon;


public class Menu {

    public void displayMenu() {
        Scanner newMenu = new Scanner(System.in);
        System.out.println("»»——☠——« DONJONS & DRAGONS »——☠——««");
        System.out.println("1. New Game");
        System.out.println("2. Exit Game");
        System.out.println(("3. Crédits"));
        String choice = newMenu.nextLine();

        if (choice.equals("1")) {
            Charactair joueur = newGame();
            new Game(joueur);
        }
        if (choice.equals("2")) {
            System.out.println("Chao!");
        }
        if (choice.equals("3")) {
            System.out.println("Created By EH ©");
            System.out.println("retour au menu? yes(y) no(n)");
            String retourMenu = newMenu.nextLine();
                if(retourMenu.equals("y")){
                    displayMenu();
                }
                if (retourMenu.equals("n")){
                    System.out.println("Chao!");
                }
        }
    }

    public Charactair newGame() {
//        System.out.println();
        Scanner newCharacter = new Scanner(System.in);

        System.out.print("Taper le nom : ");
        String nomJoueur = newCharacter.nextLine();

        System.out.print("Taper le Type : ");
        String typeJoueur = newCharacter.nextLine();

        while (!typeJoueur.equals("Warrior") && !typeJoueur.equals("Wizard")) {
            System.out.println("Veuillez choisir entre 'Warrior' et 'Wizard'");
            System.out.print("Taper le Type : ");
            typeJoueur = newCharacter.nextLine();
        }
//
        System.out.print("Voulez vous changer des infos?  [y/n]");
        if (newCharacter.nextLine().equals("y")) {
            System.out.print("Voulez vous changer le nom?  [y/n]");
            if (newCharacter.nextLine().equals("y")) {
                System.out.print("Taper le nouveau nom : ");
                nomJoueur = newCharacter.nextLine();
            }
            System.out.print("Voulez vous changer la classe?  [y/n]");
            if (newCharacter.nextLine().equals("y")) {
                System.out.print("Taper la nouvelle classe : ");
                typeJoueur = newCharacter.nextLine();
            }
        }
        Charactair joueurUn;
        if (typeJoueur.equals("Warrior")) {
            joueurUn = new Warrior(nomJoueur);
//            Weapon Weapon = new Weapon(5, "Hache");
//            joueurUn.setAttackObject(Weapon);
//            Shield Shield = new Shield(6, "Bouclier Rond");
//            joueurUn.setDefenseObject(Shield);
        } else {
            joueurUn = new Wizard(nomJoueur);
//            Sort Sort = new Sort(7, "Eclair de Feu");
//            joueurUn.setAttackObject(Sort);
//            Philter Philter = new Philter(8, "Voile du couard");
//            joueurUn.setDefenseObject(Philter);
        }

        System.out.println(joueurUn);

        return joueurUn;
    }
}

