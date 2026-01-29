package com.tictactoe.Player;

public class TurnManager {
    private Player player1;
    private Player player2;
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

    public Player getPlayer1() {
    return player1;
    }

    public Player getPlayer2() {
    return player2;
    }

    public void reset(){
        current = player1;
    }

}