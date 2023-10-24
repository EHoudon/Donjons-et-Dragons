package Character;

import Board.Case;

public class Sorcerer extends Enemy implements Case {
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

    @Override
    public void interaction(Charactair joueur) {


    }
}