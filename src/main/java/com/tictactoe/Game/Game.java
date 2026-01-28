package com.tictactoe.Game;

import javax.net.ssl.TrustManager;

import com.tictactoe.Board.Board;

public class Game {
    private final Board board;
    private final TurnManager turnManager ;
    private final MoveValidator moveValidator;
    private final GameRules gameRules;
    
    public Game(Board board, Player player1,Player player2){
        this.board=board;
        this.turnManager= new TrustManager(player1,player2);
         this.moveValidator= new MoveValidator();
         this.gameRules= new GameRules();
    
    }

}
