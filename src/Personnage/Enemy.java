package Personnage;

import Board.Case;

public abstract class Enemy extends Charactair implements Case {

    public Enemy(String name,int life,int attackStrength){
    super(name,life,attackStrength);
}

    @Override
    public String toString() {
        String type = "Enemy";
        return "Enemy" + '\n' +
                "type: " + type + '\n' +
                "name: " + getName() + '\n' +
                "vie: " + getLife() + '\n' +
                "Attaque: " + getAttackStrength() + '\n'
                ;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void interaction(Charactair joueur) {


    }

}
