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
    int[] myBoard;

    private ArrayList<Case> al = new ArrayList<Case>();

    public ArrayList<Case> getAl() {
        return al;
    }

    public Board() {


        for (int index = 0; index < 64; index++) {
            Casevide a = new Casevide();

            switch (index) {
                case 45, 52, 56, 62:
                    al.add(new Dragon());
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47:
                    al.add(new Sorcerer());
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30:
                    al.add(new Goblin());
                case 2, 11, 5, 22, 38:
                    al.add(new Club());
                case 19, 26, 42, 53:
                    al.add(new Sword());
                case 1, 4, 8, 17, 23:
                    al.add(new Flash());
                case 48, 49:
                    al.add(new FireBall());
                case 7, 13, 31, 33, 39, 43:
                    al.add(new NormalPotion(5));
                case 28, 41:
                    al.add(new BigPotion(10));
                default:
                    al.add(a);
            }

        }

//        public void getTypeCase ( int position){
//            System.out.println("Case " + position + " = " + al.get(position));
//        }

//        public ArrayList<Case> getAl () {
//            return al;
//        }
    }

    public void getTypeCase(int position) {
        System.out.println("Case " + position + " = " + al.get(position));
    }
}




