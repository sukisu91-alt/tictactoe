package com.tictactoe;

public class Board {
    private char [][] board;
    public Board(){
        board = new char [][]{
           {' ',' ',' '},
           {' ',' ',' '},
           {' ',' ',' '},
        };
    }
    public void showBoard(){
        System.out.println();
        for (int i= 0; i <3;i++){
            System.out.println(" " + board + " ");
        }

    }
}


