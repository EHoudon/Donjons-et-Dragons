public class Game {
    int positionPlayer;
    int dice;

    public Game(Character joueur) {
//        int[] myBoard = new int[64];
        joueur.setPlayerPosition(0);
        positionPlayer  = joueur.getPlayerPosition();
        System.out.println("Position de départ : " + positionPlayer);

        while (positionPlayer <= 64 && positionPlayer!= 64) {
            dice = (int) (Math.random() * 5 + 1);
            System.out.println("lancer de dé : " + dice);
            positionPlayer = positionPlayer+dice;
            if (positionPlayer>64){
                positionPlayer = 64 - ( positionPlayer-64);
            }
            joueur.setPlayerPosition(positionPlayer);
            System.out.println("Position du joueur : " + positionPlayer);

            }
        }
    }

