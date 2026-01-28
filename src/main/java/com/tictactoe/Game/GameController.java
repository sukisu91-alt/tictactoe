package com.tictactoe.Game;

import com.tictactoe.Board.Board;
import com.tictactoe.Player.Player;

public class GameController {
    private final Board board;
    private final TurnManager turnManager ;
    private final MoveValidator moveValidator;
    private final GameRules gameRules;

    public GameController(Board board, Player player1, Player player2){
        this.board = board;
        this.turnManager = new TurnManager(player1, player2);
        this.moveValidator = new MoveValidator();
        this.gameRules = new GameRules();
    }

    public Player getCurrentPlayer(){
        return turnManager.getCurrentPlayer();
    }

    public boolean makeMove(int row, int col){
        Player player = turnManager.getCurrentPlayer();
        if (!moveValidator.isValid(board, row, col)) return false;
        board.setCell(row, col, player.getSymbol());
        return true;
    }

    public boolean hasWinner(){
        return gameRules.isWinner(board,getCurrentPlayer().getSymbol());
    }

    public boolean isDraw(){
        return gameRules.isDraw(board);
    }

    public void nextTurn(){
        turnManager.nextTurn();
    }

    public void reset(){
        board.reset();
        turnManager.reset();
    }

    public Board getBoard(){
        return board;
    }
}
