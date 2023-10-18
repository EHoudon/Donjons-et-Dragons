public class Board {
    int[] myBoard = new int[64];

    public Board() {
        for (int i = 0; i < myBoard.length; i++) {
            myBoard[i] = i;
        }

        System.out.println(myBoard[2]);
    }
}



