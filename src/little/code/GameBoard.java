package little.code;

public class GameBoard {
    Pieces[][] board;
    int WIDTH = 3;
    int HEIGHT = 3;

    GameBoard() {
        board = new Pieces[WIDTH][HEIGHT];
        emptyBoard();
    }

    private void emptyBoard() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                board[i][j] = Pieces.EMPTY;
            }
        }
    }

    public void putPiece(int x, int y, Pieces piece) {
        board[x][y] = piece;
    }

    public void checkForWin() {
        Pieces checkedPiece = board[0][0];
        int i = 0;
        int j = 0;
        while (i < HEIGHT) {
            if (!checkedPiece.equals(board[i][i])) {
                System.out.println("Nie bangla");
                return;
            }
            System.out.println("Bangla");
            i++;
        }
//        i = 0;
//        while (i < HEIGHT) {
//
//        }
    }

}
