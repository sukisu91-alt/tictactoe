package com.tictactoe.Player;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TurnManagerTest {
    public Player player1;
    public Player player2;
    public TurnManager turnManager;

    @Before
    public void setup(){
        player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        turnManager = new TurnManager(player1, player2);
    }

    @Test
    public void shouldStartWithPlayer1() {
        assertEquals(player1, turnManager.getCurrentPlayer());
    }

    @Test
    public void shouldChangeTurnToPlayer2() {
        turnManager.nextTurn();
        assertEquals(player2, turnManager.getCurrentPlayer());
    }

    @Test
    public void shouldAlternateTurnsCorrectly() {
        turnManager.nextTurn();
        assertEquals(player2, turnManager.getCurrentPlayer());

        turnManager.nextTurn();
        assertEquals(player1, turnManager.getCurrentPlayer());
    }

    @Test
    public void resetShouldSetCurrentPlayerToPlayer1() {
        turnManager.nextTurn();
        turnManager.reset();

        assertEquals(player1, turnManager.getCurrentPlayer());
    }
}
