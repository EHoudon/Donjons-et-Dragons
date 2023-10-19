public class Board {
    int[] myBoard;

    public Board() {
        myBoard = new int[64];
        for (int i = 0; i < myBoard.length; i++) {
            myBoard[i] = i;
        }
    }
}



