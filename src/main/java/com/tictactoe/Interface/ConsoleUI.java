package com.tictactoe.Interface;
import com.tictactoe.Board.Board;
import com.tictactoe.Board.BoardRenderer;
import com.tictactoe.Game.Game;
import com.tictactoe.Player.Player;

public class ConsoleUI {
    private InputReader input;
    private OutputWriter output;
    private BoardRenderer renderer;

    public ConsoleUI(InputReader input, OutputWriter output, BoardRenderer renderer) {
        this.input = input;
        this.output = output;
        this.renderer = renderer;
    }

    public Game createGame() {
        String name1 = input.readNonEmptyString("\u001B[4mIngrese el nombre del Jugador 1:\u001B[0m ");
        String name2 = input.readNonEmptyString("\u001B[4mIngrese el nombre del Jugador 2:\u001B[0m ");

        Player player1 = new Player(name1, 'X');
        Player player2 = new Player(name2, 'O');

        Board board = new Board();
        return new Game(board, player1, player2);
    }

    public void start(Game game) {
        boolean gameActive = true;

        while (gameActive) {
            renderer.show(game.getBoard());

            Player player = game.getActualPlayer();
            output.showMessage(
                "\u001B[36mTurno de\u001B[0m " + player.getName() + " (\u001B[31m" + player.getSymbol() + "\u001B[0m)"
            );

            int row = input.readInt("\u001B[35mFila (0-2):\u001B[0m ");
            int col = input.readInt("\u001B[35mColumna (0-2):\u001B[0m ");

            if (game.makeMove(row, col)) {
                if (game.hasWinner()) {
                    renderer.show(game.getBoard());
                    output.showMessage("¡" + player.getName() + " \u001B[32mGANA!\u001B[0m");
                    gameActive = false;
                } else if (game.isDraw()) {
                    renderer.show(game.getBoard());
                    output.showMessage("\u001B[33m¡EMPATE!\u001B[0m");
                    gameActive = false;
                } else {
                    game.changeTurn();
                }
            } else {
                output.showMessage("\u001B[31mMovimiento inválido\u001B[0m");
            }

            if (!gameActive) {
                char option;

                    do {
                        option = Character.toLowerCase(
                        input.readChar("\u001B[1m¿Jugar otra partida? (s/n):\u001B[0m ")
                        );
                    } while (option != 's' && option != 'n');

                    if (option == 's') {
                        game.restart();
                        gameActive = true;
                    }
                }
        }
    }
}
