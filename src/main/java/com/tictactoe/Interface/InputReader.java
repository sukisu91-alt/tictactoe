package com.tictactoe.Interface;
import java.util.Scanner;

public class InputReader {
    private Scanner scanner = new Scanner(System.in);

    public int readInt(String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Entrada inválida. Introduce un número.");
                scanner.next();
            }
        }
    }

    public char readChar(String message) {
        System.out.print(message);
        return scanner.next().toLowerCase().charAt(0);
    }

    public String readNonEmptyString(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("El nombre no puede estar vacío.");
        }
    }
}
