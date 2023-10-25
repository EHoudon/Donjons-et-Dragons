package Personnage;

import Board.Case;

public class Sorcerer extends Enemy {
    private String type = "Dragon";

    public Sorcerer(){
        super("Sorcier",5,7);
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}