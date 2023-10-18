import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public void start() {
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
        int lifeJoueur = 0;
        int attackJoueur = 0;
        if (typeJoueur.equals("Warrior")) {
            lifeJoueur = 10;
            attackJoueur = 10;
        }
        if (typeJoueur.equals("Wizard")) {
            lifeJoueur = 6;
            attackJoueur = 15;
        }


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
        Character JoueurUn = new Character(nomJoueur, typeJoueur, lifeJoueur, attackJoueur);
        System.out.println("Votre nom : " + JoueurUn.getName());
        System.out.println("Classe : " + JoueurUn.getType());
        System.out.println("vie : " + JoueurUn.getLife());
        System.out.println("attaque : " + JoueurUn.getAttackStrength());
    }
}

