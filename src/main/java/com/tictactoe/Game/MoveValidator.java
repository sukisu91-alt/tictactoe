package com.tictactoe.Game;

import com.tictactoe.Board.Board;

public class MoveValidator {
 public boolean isValid(Board board, int row, int col) {
        return board.isInBounds(row, col) && board.isCellEmpty(row, col);
    }
}
