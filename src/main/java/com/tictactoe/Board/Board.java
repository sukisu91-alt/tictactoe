package com.tictactoe.Board;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        reset();

    }

    public char getCell(int row, int col) {
        return board[row][col];
    }

    public void setCell(int row, int col, char symbol) {
        board[row][col] = symbol;

    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == ' ';
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3;

    }

    public void reset (){
        for (int i=0; i<3;i++){
            for (int j=0;j<3;j++){
                board[i][j]= ' ';
            }
        }
    }
}
