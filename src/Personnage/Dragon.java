package Personnage;

import Board.Case;

public class Dragon extends Enemy {
    private String type = "Dragon";

    public Dragon(){
        super("Dragon",10,5);
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
