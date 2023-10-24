package Character;

import Board.Case;

public class Dragon extends Enemy implements Case {
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

    @Override
    public void interaction(Charactair joueur) {


    }


}
