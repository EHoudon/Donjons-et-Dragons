import Board.Board;
import Personnage.*;
import Exeptions.PersonnageHorsPlateauException;
import Board.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    private int dice;
    private final Personnage gameJoueur;
    private final Board myBoard;

    public Game(Personnage joueur) {
        myBoard = new Board();
        gameJoueur = joueur;
    }

    public void start() {
        debutPartie();
        while (gameJoueur.getPlayerPosition() < myBoard.getSize()) {
            choixJoueur(getGameJoueur());
        }
        finDePartie();
    }

    private void debutPartie() {
        gameJoueur.setPlayerPosition(1);
        gameJoueur.setTotalAttack(gameJoueur.getAttackStrength());
        System.out.println("Position de départ : " + gameJoueur.getPlayerPosition());
    }

    public Personnage getGameJoueur() {
        return gameJoueur;
    }

    private void choixJoueur(Personnage joueur) {
        Scanner tour = new Scanner(System.in);
        System.out.println(("Avancer (1)  Mes Stats (2)"));
        String choice = tour.nextLine();
        if (choice.equals("1")) {
            tourDeJeu(joueur);
        } else if (choice.equals("2")) {
            System.out.println(joueur);
            choixJoueur(joueur);
        } else {
            System.out.println("veuillez choisir (1) ou (2)");
            choixJoueur(joueur);
        }
    }

    private void tourDeJeu(Personnage joueur) {
        throwDice();
        System.out.println("lancer de dé : " + dice);
        joueur.setPlayerPosition(gameJoueur.getPlayerPosition() + dice);
        try {
            controle();
        } catch (PersonnageHorsPlateauException e) {
            System.out.println("fin de partie, vous avez gagné !!");
            return;
        }
        resultInteraction();
    }

    private void resultInteraction(){
        myBoard.getTypeCase(gameJoueur.getPlayerPosition());
        int resultInteraction = myBoard.getAl().get(gameJoueur.getPlayerPosition()).interaction(gameJoueur);

        switch (resultInteraction) {
            case 1:
                Casevide casevide = new Casevide();
                myBoard.getAl().set(gameJoueur.getPlayerPosition(), casevide);
                break;
            case 2:
                System.out.println("pas d'intéraction");
                break;
            case 3:
                resultInteraction();
                break;
            case 4:
                System.out.println("Vous etes mort!!!");
                finDePartie();
        }
        myBoard.getTypeCase(gameJoueur.getPlayerPosition());
        DataBase dataBase = new DataBase();
        dataBase.UpdateHero(gameJoueur);
    }

    private void finDePartie() {
        System.out.println("retour au menu (1) Statistiques de la partie (2) Quitter le jeu (3)");
        Scanner tour = new Scanner(System.in);
        String choice = tour.nextLine();
        if (choice.equals("1")) {
            Menu menu = new Menu();
            menu.displayMenu();
        } else if (choice.equals("2")) {
            System.out.println("Not implemented, veuillez consulter la road map");
            finDePartie();
        } else if (choice.equals("3")) {
            System.out.println("Chao!");
        } else {
            System.out.println("veuillez choisir (1), (2) ou (3)");
            finDePartie();
        }
    }

    private void throwDice() {
        dice = (int) (Math.random() * 5 + 1);
    }

    public void controle() throws PersonnageHorsPlateauException {
        if (gameJoueur.getPlayerPosition() >= 64)
            throw new PersonnageHorsPlateauException();
    }

}




