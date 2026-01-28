package com.tictactoe.Player;

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
    public void nextTurn(){
        current = (current == player1)  ? player2 : player1; 
    }
    public void reset(){
        current = player1;
    }

}