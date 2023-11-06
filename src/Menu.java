import Defensif.Philter;
import Defensif.Shield;
import Personnage.Personnage;
import Personnage.Warrior;
import Personnage.Wizard;

import java.util.Scanner;

public class Menu {

    public Menu (){
        DataBase dataBase = new DataBase();
        displayMenu(dataBase);
    }

    public void displayMenu(DataBase db) {
        Scanner newMenu = new Scanner(System.in);
        System.out.println("»»——☠——« DONJONS & DRAGONS »——☠——««");
        System.out.println("1. New Game");
        System.out.println("2. Voir mes Personnages");
        System.out.println("3. Exit Game");
        System.out.println(("4. Crédits"));
        String choice = newMenu.nextLine();

        if (choice.equals("1")) {
            Personnage joueur = newPlayer(db);
            Game game = new Game(joueur);
            game.start(db);
        }
        if (choice.equals("2")){
            db.ListPlayer();
            System.out.println(" ");
            displayMenuListCharacter(db);
            db.DeleteHero();
            displayMenu(db);
        }
        if (choice.equals("3")) {
            System.out.println("Chao!");
        }
        if (choice.equals("4")) {
            System.out.println("Created By EH ©");
            System.out.println("retour au menu? yes(y) no(n)");
            String retourMenu = newMenu.nextLine();
            if (retourMenu.equals("y")) {
                displayMenu(db);
            }
            if (retourMenu.equals("n")) {
                System.out.println("Chao!");
            }
        }
    }

    public Personnage newPlayer(DataBase db) {
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

        Personnage joueurUn;

        if (typeJoueur.equals("Warrior")) {
            joueurUn = new Warrior(nomJoueur);

            Shield Shield = new Shield(6, "Bouclier Rond");
            joueurUn.setDefenseObject(Shield);
        } else {
            joueurUn = new Wizard(nomJoueur);

            Philter Philter = new Philter(8, "Voile du couard");
            joueurUn.setDefenseObject(Philter);
        }
        db.CreateHero(joueurUn);
        System.out.println(joueurUn);
        return joueurUn;
    }

    public void displayMenuListCharacter(DataBase db){
        Scanner newMenu = new Scanner(System.in);

        System.out.println("1. Retour Menu");
        System.out.println("2. Supprimer un personnage");
        String choice = newMenu.nextLine();

        if (choice.equals("1")){
            displayMenu(db);
        }
        if (choice.equals("2")){
            db.DeleteHero();
            db.ListPlayer();
            displayMenuListCharacter(db);
        }
        else {
            displayMenuListCharacter(db);
        }
    }
}

