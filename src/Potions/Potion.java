package Potions;

import Board.Case;

public class Potion extends Case {
   private int Hp;
   private String name;

    public Potion(String name,int Hp){
        this.name = name;
        this.Hp = Hp;
    }
}
