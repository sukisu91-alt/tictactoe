package com.tictactoe.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class TurnManagerTest {
    private Player player1;
    private Player player2;
    private TurnManager turnManager;

    @BeforeEach
    void setUp() {
        player1 = new Player("Player 1", 'X');
        player2 = new Player("Player 2", 'O');
        turnManager = new TurnManager(player1, player2);
    }

    @Test
    void shouldStartWithPlayer1() {
        assertEquals(player1, turnManager.getCurrentPlayer());
    }

    @Test
    void shouldChangeTurnToPlayer2() {
        turnManager.nextTurn();
        assertEquals(player2, turnManager.getCurrentPlayer());
    }

    @Test
    void shouldAlternateTurnsCorrectly() {
        turnManager.nextTurn();
        assertEquals(player2, turnManager.getCurrentPlayer());

        turnManager.nextTurn();
        assertEquals(player1, turnManager.getCurrentPlayer());
    }

    @Test
    void resetShouldSetCurrentPlayerToPlayer1() {
        turnManager.nextTurn();
        turnManager.reset();

        assertEquals(player1, turnManager.getCurrentPlayer());
    }
}
