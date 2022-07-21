import junit.framework.TestCase;
import little.code.GameBoard;
import little.code.Pieces;
import org.junit.Test;

public class GameBoardTest extends TestCase {

    GameBoard testBoard = new GameBoard();
    @Test
    public void testputPieceTest() {
        testBoard.putPiece(0,0, Pieces.CIRCLE);
        assertEquals(Pieces.CIRCLE.toString(), testBoard.board[0][0].toString());
    }

    @Test
    public void testcheckFaorWin() {
        assertTrue(1<2);
    }
}