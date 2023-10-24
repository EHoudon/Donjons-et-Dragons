package Board;

import Offensif.*;
import Character.Dragon;
import Character.Sorcerer;
import Character.Goblin;
import Potions.BigPotion;
import Potions.NormalPotion;

import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    int[] myBoard;


    public Board() {
        ArrayList<Case> al = new ArrayList<Case>();

        for(int i = 0; i< 64; i++){
            Case a  = new Case();
            al.add(a);

        }

        al.add(45, new Dragon());
        al.add(52, new Dragon());
        al.add(56, new Dragon());
        al.add(62, new Dragon());

        al.add(10, new Sorcerer());
        al.add(20, new Sorcerer());
        al.add(25, new Sorcerer());
        al.add(32, new Sorcerer());
        al.add(35, new Sorcerer());
        al.add(36, new Sorcerer());
        al.add(37, new Sorcerer());
        al.add(40, new Sorcerer());
        al.add(44, new Sorcerer());
        al.add(47, new Sorcerer());

        al.add(3, new Goblin());
        al.add(6, new Goblin());
        al.add(9, new Goblin());
        al.add(12, new Goblin());
        al.add(15, new Goblin());
        al.add(18, new Goblin());
        al.add(21, new Goblin());
        al.add(24, new Goblin());
        al.add(27, new Goblin());
        al.add(30, new Goblin());

        al.add(2, new Club());
        al.add(11, new Club());
        al.add(5, new Club());
        al.add(22, new Club());
        al.add(38, new Club());

        al.add(19, new Sword());
        al.add(26, new Sword());
        al.add(42, new Sword());
        al.add(53, new Sword());

        al.add(1, new Flash());
        al.add(4, new Flash());
        al.add(8, new Flash());
        al.add(17, new Flash());
        al.add(23, new Flash());

        al.add(48, new FireBall());
        al.add(49, new FireBall());

        al.add(7, new NormalPotion(5));
        al.add(13, new NormalPotion(5));
        al.add(31, new NormalPotion(5));
        al.add(33, new NormalPotion(5));
        al.add(39, new NormalPotion(5));
        al.add(43, new NormalPotion(5));

        al.add(43, new BigPotion(10));
        al.add(43, new BigPotion(10));


//        public void posBoard(){
//                System.out.println(al.get());
//    }


//        for(int i =0 ; i < 64; i++)
//        {
//            System.out.println("Case " + i + " = " + al.get(i));
//        }

//        int position1 = al.indexOf(13);
    }


    public void get(int i) {
    }
}





