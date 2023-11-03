package Potions;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import Board.*;
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

    public int getHp() {
        return Hp;
    }

    public String getName() {
        return name;
    }

    @Override
    public int interaction(Personnage joueur) {
        joueur.setLife(joueur.getLife() + Hp);
        if (joueur.getLife() > joueur.getMaxLife()) {
            joueur.setLife(joueur.getMaxLife());
        }



        return 1;
    }
}
