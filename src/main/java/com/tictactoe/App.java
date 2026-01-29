package com.tictactoe;

import com.tictactoe.Board.BoardRenderer;
import com.tictactoe.Interface.ConsoleUI;
import com.tictactoe.Interface.OutputWriter;
import com.tictactoe.Interface.InputReader;
import com.tictactoe.Game.Game;


public class App 
{
    public static void main( String[] args )
    {
        //Instrucciones del juego
        instructions();
        ConsoleUI ui=new ConsoleUI(new InputReader(),new OutputWriter(),new BoardRenderer());
        Game game=ui.createGame();
        ui.start(game);

        

    }

    private static void instructions() {
        System.out.println("""

═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════
                                    ╔════════════════════════════════╗
                                    │          TIC TAC TOE           │
                                    ╚════════════════════════════════╝

                                            ¡Bienvenidas(os)!


OBJETIVO DEL JUEGO: 
Ser el primer jugador en colocar tres símbolos iguales en línea:

- Horizontal
- Vertical
- Diagonal

──────────────────────────────────

JUGADORES:
- Jugador 1 -> X
- Jugador 2 -> O

──────────────────────────────────

CÓMO JUGAR: 

En tu turno, elige una posición del tablero usando 0 1 o 2 para indicar la fila y 0 1 o 2 para indicar la columna. 

1. Selecciona la FILA:

   0 -> fila superior
   1 -> fila central
   2 -> fila inferior

       Ejemplo de filas:

         0 | 0 | 0
        ---+---+---
         1 | 1 | 1
        ---+---+---
         2 | 2 | 2



2. Selecciona la COLUMNA:
   0 -> columna izquierda
   1 -> columna centro
   2 -> columna derecha

      Ejemplo de columnas:

          0 | 1 | 2
         ---+---+---
          0 | 1 | 2
         ---+---+---
          0 | 1 | 2

──────────────────────────────────

NOTAS: 
- Solo ingresa un número a la vez.  
- El tablero se mostrará después de cada movimiento.
- Cuando un jugador complete una línea, aparecerá el mensaje indicando el ganador. 

    ▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀
                                             ¡A jugar!
    ▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀
""");
    }  

}
