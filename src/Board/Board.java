package Board;

import Offensif.*;
import Personnage.Dragon;
import Personnage.Sorcerer;
import Personnage.Goblin;
import Potions.BigPotion;
import Potions.NormalPotion;

import java.util.ArrayList;
import java.util.Map;

public class Board {
    private ArrayList<Case> al = new ArrayList<Case>();

    public ArrayList<Case> getAl() {
        return al;
    }
    public Board() {
        for (int index = 0; index < 64; index++) {
//            Casevide a = new Casevide();
            al.add(SwitchCase(index));
        }
    }
    public Case SwitchCase(int index){
        return switch (index) {
            case 45, 52, 56, 62 -> (new Dragon());
            case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> (new Sorcerer());
            case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> (new Goblin());
            case 2, 11, 5, 22, 38 -> (new Club());
            case 19, 26, 42, 53 -> (new Sword());
            case 1, 4, 8, 17, 23 -> (new Flash());
            case 48, 49 -> (new FireBall());
            case 7, 13, 31, 33, 39, 43 -> (new NormalPotion());
            case 28, 41 -> (new BigPotion());
            default -> (new Casevide());
        };
    }
    public void getTypeCase(int position) {
        System.out.println("Case " + position + " = " + al.get(position));
    }
public int getSize(){
        return al.size();
}
    public void setAl(ArrayList<Case> al) {
        this.al = al;
    }
}




