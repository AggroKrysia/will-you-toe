package little.code;

public class GameBoard {
    private Pieces[][] board;
    private final static int WIDTH = 3;
    private final static int HEIGHT = 3;

    public GameBoard() {
        board = new Pieces[WIDTH][HEIGHT];
        emptyBoard();
    }

    public void emptyBoard() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                board[i][j] = Pieces.EMPTY;
            }
        }
    }

    public void putPiece(int x, int y, Pieces piece) {
        board[x][y] = piece;
    }

    public Pieces getPiece(int x, int y) {
        return board[x][y];
    }

    public boolean checkForWin() {
        return checkDianogal() || checkSecondDianogal() || checkVertical() || checkHorizontal();
    }

    private boolean checkDianogal() {
        Pieces checkedPiece = board[0][0];
        int i = 0;
        while (i < HEIGHT) {
            if (!checkedPiece.equals(board[i][i])) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean checkSecondDianogal() {
        Pieces checkedPiece = board[0][HEIGHT - 1];
        int i = HEIGHT - 1;
        int j = 0;
        while (i >= 0) {
            if (!checkedPiece.equals(board[j][i])) {
                return false;
            }
            j++;
            i--;
        }
        return true;
    }

    private boolean checkVertical() {
        Pieces checkedPiece = board[0][0];
        for (int i = 0; i < HEIGHT; i++) {
            if (checkRow(checkedPiece, i)) {
                return true;
            }
            checkedPiece = board[0][i];
        }
        return false;
    }

    private boolean checkRow(Pieces checkedPiece, int y) {
        for(int i = 0; i < WIDTH; i++){
            if (!checkedPiece.equals(board[i][y])) {
                return false;
            }
        }
        return true;
    }

    private boolean checkHorizontal(){
        Pieces checkedPiece = board[0][0];
        for (int i = 0; i < WIDTH; i++) {
            if (checkColumn(checkedPiece, i)) {
                return true;
            }
            checkedPiece = board[i][0];
        }
        return false;
    }

    private boolean checkColumn(Pieces checkedPiece, int x){
        for(int i = 0; i < HEIGHT; i++){
            if (!checkedPiece.equals(board[x][0])) {
                return false;
            }
        }
        return true;
    }
}
