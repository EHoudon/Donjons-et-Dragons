package Personnage;

import Board.Case;

public class Goblin extends Enemy {
    private String type = "Dragon";

    public Goblin(){
        super("Goblin",2,2);
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
