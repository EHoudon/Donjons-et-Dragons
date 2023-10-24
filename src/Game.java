import Board.Board;
import Character.*;
import Exeptions.PersonnageHorsPlateauException;

import java.util.Scanner;
public class Game {
    int positionPlayer;
    int dice;

    public Game(Charactair joueur) {
        Board myBoard = new Board();
        joueur.setPlayerPosition(1);
        positionPlayer = joueur.getPlayerPosition();
        System.out.println("Position de départ : " + positionPlayer);
        while (positionPlayer <= 64 && positionPlayer != 64) {
            try {
                tourDeJeu(joueur);
                myBoard.getTypeCase(positionPlayer);
                myBoard.getAl().get(positionPlayer).interaction(joueur);

            } catch (PersonnageHorsPlateauException e) {
                System.out.println("Fin du jeu!");
                System.out.println("Position du joueur : " + positionPlayer);
            }

        }
    }

    public void throwDice() {
        dice = (int) (Math.random() * 5 + 1);
    }

    public void tourDeJeu(Charactair joueur) throws PersonnageHorsPlateauException {
        Scanner tour = new Scanner(System.in);
        System.out.println(("Avancer (1)  Mes Stats (2)"));
        String choice = tour.nextLine();
        if (choice.equals("1")) {
            throwDice();
            System.out.println("lancer de dé : " + dice);
            positionPlayer = positionPlayer + dice;
            if (positionPlayer > 64) {
                joueur.setPlayerPosition(64);
                throw new PersonnageHorsPlateauException();
            }
            joueur.setPlayerPosition(positionPlayer);
            System.out.println("Position du joueur : " + positionPlayer);

        }
        if (choice.equals("2")) {
            System.out.println(joueur);
            tourDeJeu(joueur);
        }
    }

}




