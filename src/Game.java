import Board.Board;
import Personnage.*;
import Exeptions.PersonnageHorsPlateauException;

import java.util.Scanner;

public class Game {
    private int positionPlayer;
    private int dice;
    private Personnage gameJoueur;
    private final Board myBoard;

    public Game(Personnage joueur) {
        myBoard = new Board();
        gameJoueur = joueur;
    }
    private void throwDice() {
        dice = (int) (Math.random() * 5 + 1);
    }

//    public void start(){
//        gameJoueur.setPlayerPosition(0);
//    }
    public void start(){
        gameJoueur.setPlayerPosition(0);
            System.out.println("Position de départ : " + gameJoueur.getPlayerPosition());
            while (gameJoueur.getPlayerPosition() <= 64 && gameJoueur.getPlayerPosition() != 64) {
                try {
                    tourDeJeu(gameJoueur);
                    myBoard.getTypeCase(gameJoueur.getPlayerPosition());
                    myBoard.getAl().get(gameJoueur.getPlayerPosition()).interaction(gameJoueur);

                } catch (PersonnageHorsPlateauException e) {
                    System.out.println("Position du joueur : " + gameJoueur.getPlayerPosition());
//                Scanner tour = new Scanner(System.in);
                    System.out.println("Fin du jeu! Vous avez gagné!");
//                System.out.println("retour au menu? [y/n]");
//                String choice = tour.nextLine();
//                if (choice.equals("y")){
//                    new Menu();
                }

            }
        }




    private void tourDeJeu(Personnage joueur) throws PersonnageHorsPlateauException {
        Scanner tour = new Scanner(System.in);
        System.out.println(("Avancer (1)  Mes Stats (2)"));
        String choice = tour.nextLine();
        if (choice.equals("1")) {
            throwDice();
            System.out.println("lancer de dé : " + dice);
            joueur.setPlayerPosition(gameJoueur.getPlayerPosition() + dice);
            if (gameJoueur.getPlayerPosition() > 64) {
                joueur.setPlayerPosition(64);
                throw new PersonnageHorsPlateauException();
            }
            joueur.setPlayerPosition(gameJoueur.getPlayerPosition());
            System.out.println("Position du joueur : " + gameJoueur.getPlayerPosition());
        }
        if (choice.equals("2")) {
            System.out.println(joueur);
            tourDeJeu(joueur);
        }
    }
}




