package Potions;

import Board.Case;
import Personnage.*;
public class Potion implements Case {
    private int Hp;
    private String name;

    public Potion(String name, int Hp) {
        this.name = name;
        this.Hp = Hp;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "Hp=" + Hp +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void interaction(Personnage joueur) {
        joueur.setLife(joueur.getLife() + Hp);
        if (joueur.getLife() > joueur.getMaxLife()) {
            joueur.setLife(joueur.getMaxLife());
        }
    }
}
