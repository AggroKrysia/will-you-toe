package little.code;

public class Main {

    public static void main(String[] args) {
        /* there will be tic tac toe today hopefully */

        GameBoard boardGame = new GameBoard();
        boardGame.putPiece(0,0, Pieces.CROSS);
        boardGame.putPiece(1,1, Pieces.CIRCLE);
        boardGame.putPiece(2,2, Pieces.CIRCLE);

        boardGame.checkForWin();

    }
}
