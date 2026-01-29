package com.tictactoe.Game;
import com.tictactoe.Player.Player;
import com.tictactoe.Player.TurnManager;

public class GameController {
    private final TurnManager turnManager;

    public GameController(Player p1, Player p2) {
        this.turnManager = new TurnManager(p1, p2);
    }

    public Player getCurrentPlayer() {
        return turnManager.getCurrentPlayer();
    }

    public void nextTurn() {
        turnManager.nextTurn();
    }
}
