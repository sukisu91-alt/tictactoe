package com.tictactoe.Game;

import com.tictactoe.Board.Board;

public class GameRules {
    public boolean isWinner(Board board, char player){
        for (int i = 0; i < 3; i++) {
            if ((board.getCell(i, 0) == player) &&
                (board.getCell(i,0) == player) &&
                (board.getCell(i,0) == player)) 
                    return true;
            if ((board.getCell(0, i) == player) &&
                (board.getCell(1,i) == player) &&
                (board.getCell(2,i) == player)) 
                    return true;
        }
        return (board.getCell(0,0 ) == player && 
                board.getCell(1,1 ) == player &&
                board.getCell(2,2 ) == player) || 
                (board.getCell(0,2 ) == player && 
                board.getCell(1,1 ) == player &&
                board.getCell(2,0 ) == player);
    }

    public boolean isDraw(Board board){
        for (int i = 0; i < 3; i++)
            for (int j= 0;j < 3;j++)
                if (board.getCell(i, j) == ' ')
                    return false;
                    return true;
    }
    
    

}
