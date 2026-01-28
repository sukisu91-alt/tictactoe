package com.tictactoe.Board;

public class BoardRenderer {
    public void show (Board board){
        System.out.println();
        for (int i=0;i<3;i++){
            System.out.println(" "+ 
        board.getCell(i, 0)+" | " + 
         board.getCell(i, 1)+" | " + 
          board.getCell(i, 2)
            );
            if (i<2){
                System.out.println("---+---+---");
            }
        }
        System.out.println();
        
    }

}