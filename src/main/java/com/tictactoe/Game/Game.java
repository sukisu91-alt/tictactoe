package com.tictactoe.Game;
import com.tictactoe.Board.Board;
import com.tictactoe.Player.Player;
import com.tictactoe.Player.TurnManager;

public class Game {
    private final Board board;
    private final TurnManager turnManager;
    private final MoveValidator moveValidator;
    private final GameRules gameRules;

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.turnManager = new TurnManager(player1, player2);
        this.moveValidator = new MoveValidator();
        this.gameRules = new GameRules();
    }

    public Player getActualPlayer() {
        return turnManager.getCurrentPlayer();
    }

        public boolean makeMove(int row, int col) {
        Player player = turnManager.getCurrentPlayer();

        if (!moveValidator.isValid(board, row, col))
            return false;

        board.setCell(row, col, player.getSymbol());
        return true;
    }

    public void changeTurn() {
        turnManager.nextTurn();
    }

    public boolean hasWinner() {
        return gameRules.isWinner(board, getActualPlayer().getSymbol());
    }

    public boolean isDraw() {
        return gameRules.isDraw(board);
    }

    public void restart() {
        board.reset();
        turnManager.reset();
    }

    public Board getBoard() {
        return board;
    }
}
