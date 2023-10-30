package Personnage;

import Board.Case;
import Exeptions.PersonnageHorsPlateauException;
import Offensif.OffensifEquipement;

import java.awt.*;
import java.util.Scanner;

public abstract class Enemy extends Personnage implements Case {
    //Personnage joueur;
    public Enemy(String name, int life, int attackStrength) {
        super(name, life, attackStrength, null);
    }

    @Override
    public String toString() {
        String type = "Enemy";
        return "Enemy" + '\n' +
                "type: " + type + '\n' +
                "name: " + getName() + '\n' +
                "vie: " + getLife() + '\n' +
                "Attaque: " + getAttackStrength() + '\n'
                ;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int interaction(Personnage joueur) {
        System.out.println("Horreur! un " + this.getName());
        Scanner tour = new Scanner(System.in);
        while (this.getLife() > 0) {
            System.out.println(("Attaquer (1)  Fuir! (2)"));
            String choice = tour.nextLine();
            switch (choice) {
                case "1":
                    tourCombatAttaqueJoueur(joueur);
                    if (this.getLife() > 0) {
                        tourCombatAttaqueEnemy(joueur);
                        if (controleLifePlayer(joueur)) {
                            return 4;
                        }
                    } else {
                        System.out.println("Vous avez vaincu le " + this.getName());
                        return 1;
                    }
                    break;
                case "2":
                    int dice = (int) (Math.random() * 5 + 1);
                    int posJoueur = joueur.getPlayerPosition();
                    if (posJoueur - dice < 0) {
                        joueur.setPlayerPosition(0);
                    }
                    if (posJoueur - dice > 0) {
                        joueur.setPlayerPosition(posJoueur - dice);
                    }
                    return 3;

                default:
                    System.out.println("veuillez choisir (1) ou (2)");
                    interaction(joueur);
            }
        }
        return 2;
    }

    public void tourCombatAttaqueJoueur(Personnage joueur) {
        System.out.println("vie du " + this.getName() + " : " + this.getLife());
        System.out.println("Ma puissance d'attaque: " + joueur.getTotalAttack());
        this.setLife(this.getLife() - joueur.getTotalAttack());
        if (this.getLife() <= 0) {
            this.setLife(0);
        }
        System.out.println(" Maj vie du " + this.getName() + " : " + this.getLife());
    }

    public void tourCombatAttaqueEnemy(Personnage joueur) {
        System.out.println("Ma vie: " + joueur.getLife());
        System.out.println("Puissance d'attaque du " + this.getName() + " : " + this.getAttackStrength());
        joueur.setLife(joueur.getLife() - this.getAttackStrength());
        System.out.println("Maj Ma vie: " + joueur.getLife());
    }

    public boolean controleLifePlayer(Personnage joueur) {
        return joueur.getLife() <= 0;
    }

}
