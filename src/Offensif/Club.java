package Offensif;

import Board.Case;
import Character.*;

public class Club extends Weapon implements Case {
    public Club() {
        super(7, "Club");
    }


    @Override
    public void interaction(Charactair joueur) {
        if (joueur instanceof Warrior) {
            System.out.println("Vous prenez l'objet");
            Weapon Club = new Club();
            joueur.setAttackObject(Club);
        } else {
            System.out.println("Vous ne pouvez pas prendre cet objet!");
        }
    }
}
