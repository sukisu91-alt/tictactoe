package com.tictactoe;

import com.tictactoe.Board.BoardRenderer;
import com.tictactoe.Interface.ConsoleUI;
import com.tictactoe.Interface.OutputWriter;
import com.tictactoe.Interface.InputReader;
import com.tictactoe.Game.Game;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Instrucciones" );
        ConsoleUI ui=new ConsoleUI(new InputReader(),new OutputWriter(),new BoardRenderer());
        Game game=ui.createGame();
        ui.start(game);
    }  
}
