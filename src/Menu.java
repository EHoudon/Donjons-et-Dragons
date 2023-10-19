import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public Character start() {
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
        Character joueurUn;
        if (typeJoueur.equals("Warrior")) {
            joueurUn = new Warrior(nomJoueur,"Weapon");
        } else {
            joueurUn = new Wizard(nomJoueur);
        }

        System.out.println(joueurUn);

        return joueurUn;
    }

}

