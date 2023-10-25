package Personnage;

import Board.Case;

public class Sorcerer extends Enemy {
    private String type = "Dragon";

    public Sorcerer(){
        super("Sorcier",9,2);
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}