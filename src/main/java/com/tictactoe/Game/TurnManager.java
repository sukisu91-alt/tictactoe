package com.tictactoe.Game;

import com.tictactoe.Player.Player;

public class TurnManager {
    private final Player player1;
    private final Player player2;
    private Player current;
    public TurnManager (Player player1,Player player2){
        this.player1= player1;
        this.player2=player2;
        this.current=player1;
    }
public Player getCurrentPlayer (){
    return current;
}
    
}