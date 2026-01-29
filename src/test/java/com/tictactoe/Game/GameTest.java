package com.tictactoe.Game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tictactoe.Board.Board;
import com.tictactoe.Player.Player;

public class GameTest {
    public Game game;
    public Player player1;
    public Player player2;
@Before
public void setUp(){
    Board board=new Board();
    player1=new Player("Player 1",'X');
    player2=new Player("Player 2",'O');
    game=new Game(board,player1,player2);
}

@Test
public void fistPlayerStarts(){
    assertEquals(player1, game.getActualPlayer());
}

@Test
public void validMovePlacesSymbolOnBoard(){
    boolean result = game.makeMove(0, 0);

        assertTrue(result);
        assertEquals('X', game.getBoard().getCell(0, 0));
}

@Test
public void invalidMoveDoesNotPlaceSymbol(){
    game.makeMove(0, 0);
    boolean result=game.makeMove(0, 0);
    assertFalse(result);
    assertEquals('X', game.getBoard().getCell(0, 0));
}

@Test
public void changeTurnSwitchesPlayer(){
    game.changeTurn();
    assertEquals(player2, game.getActualPlayer());
}

@Test
public void detectsWinner(){
    game.makeMove(0, 0);
        game.changeTurn();
        game.makeMove(1, 0);
        game.changeTurn();

        game.makeMove(0, 1);
        game.changeTurn();
        game.makeMove(1, 1);
        game.changeTurn();

        game.makeMove(0, 2);

        assertTrue(game.hasWinner());
}

/*@Test
public void detectsDraw(){
    game.makeMove(0,0); game.changeTurn();
        game.makeMove(0,1); game.changeTurn();
        game.makeMove(0,2); game.changeTurn();

        game.makeMove(1,0); game.changeTurn();
        game.makeMove(1,1); game.changeTurn();
        game.makeMove(1,2); game.changeTurn();

        game.makeMove(2,1); game.changeTurn();
        game.makeMove(2,0); game.changeTurn();
        game.makeMove(2,2);

        assertTrue(game.isDraw());
        assertFalse(game.hasWinner());
}*/

@Test
public void restartClearsBoardAndResetsTurn(){
    game.makeMove(0, 0);
        game.changeTurn();

        game.restart();

        assertEquals(' ', game.getBoard().getCell(0, 0));
        assertEquals(player1, game.getActualPlayer());
}

@Test
    public void testHorizontalWin() {
        Board board = new Board();
        board.setCell(0, 0, 'X');
        board.setCell(0, 1, 'X');
        board.setCell(0, 2, 'X');
        GameRules rules = new GameRules();
        assertTrue(rules.isWinner(board, 'X'));
    }

    @Test
    public void testVerticalWin() {
        Board board = new Board();
        board.setCell(0, 0, 'O');
        board.setCell(1, 0, 'O');
        board.setCell(2, 0, 'O');
        GameRules rules = new GameRules();
        assertTrue(rules.isWinner(board, 'O'));
    }

    @Test
    public void testDiagonalWin() {
        Board board = new Board();
        board.setCell(0, 0, 'X');
        board.setCell(1, 1, 'X');
        board.setCell(2, 2, 'X');
        GameRules rules = new GameRules();
        assertTrue(rules.isWinner(board, 'X'));
    }

    @Test
    public void testAntiDiagonalWin() {
        Board board = new Board();
        board.setCell(0, 2, 'O');
        board.setCell(1, 1, 'O');
        board.setCell(2, 0, 'O');
        GameRules rules = new GameRules();
        assertTrue(rules.isWinner(board, 'O'));
    }

    @Test
    public void testNoWin() {
        Board board = new Board();
        board.setCell(0, 0, 'X');
        board.setCell(0, 1, 'O');
        board.setCell(0, 2, 'X');
        GameRules rules = new GameRules();
        assertFalse(rules.isWinner(board, 'X'));
        assertFalse(rules.isWinner(board, 'O'));
    }
}
