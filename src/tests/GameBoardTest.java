import little.code.GameBoard;
import little.code.Pieces;
import org.junit.Assert;
import org.junit.Test;

public class GameBoardTest {

    GameBoard testBoard = new GameBoard();

    @Test
    public void testPutPiece() {
        testBoard.emptyBoard();
        testBoard.putPiece(0, 0, Pieces.CIRCLE);
        Assert.assertEquals(Pieces.CIRCLE.toString(), testBoard.getPiece(0,0).toString());
    }

    @Test
    public void testCheckForWinDiagonal() {
        testBoard.emptyBoard();
        testBoard.putPiece(0, 0, Pieces.CROSS);
        testBoard.putPiece(1, 1, Pieces.CROSS);
        testBoard.putPiece(2, 2, Pieces.CROSS);

        Assert.assertTrue(testBoard.checkForWin());
    }
    @Test
    public void testCheckForWinSecondDiagonal() {
        testBoard.emptyBoard();
        testBoard.putPiece(0, 2, Pieces.CROSS);
        testBoard.putPiece(1, 1, Pieces.CROSS);
        testBoard.putPiece(2, 0, Pieces.CROSS);

        Assert.assertTrue(testBoard.checkForWin());
    }

    @Test
    public void testCheckForWinVertical() {
        testBoard.emptyBoard();
        testBoard.putPiece(0, 0, Pieces.CROSS);
        testBoard.putPiece(1, 0, Pieces.CROSS);
        testBoard.putPiece(2, 0, Pieces.CROSS);

        Assert.assertTrue(testBoard.checkForWin());
    }

    @Test
    public void testCheckForWinHorizontal() {
        testBoard.emptyBoard();
        testBoard.putPiece(0, 0, Pieces.CROSS);
        testBoard.putPiece(0, 1, Pieces.CROSS);
        testBoard.putPiece(0, 2, Pieces.CROSS);

        Assert.assertTrue(testBoard.checkForWin());
    }

    @Test
    public void testCheckForWinHorizontalOnSecondRow() {
        testBoard.emptyBoard();
        testBoard.putPiece(1, 0, Pieces.CROSS);
        testBoard.putPiece(1, 1, Pieces.CROSS);
        testBoard.putPiece(1, 2, Pieces.CROSS);

        Assert.assertTrue(testBoard.checkForWin());
    }

}