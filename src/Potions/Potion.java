package Potions;

import Board.Case;
import Character.*;
public class Potion implements Case {
   private int Hp;
   private String name;

    public Potion(String name,int Hp){
        this.name = name;
        this.Hp = Hp;
    }

    @Override
    public void interaction(Charactair joueur) {


    }
}
