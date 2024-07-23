package Module6_KorotaevaSA.Middle.Task2;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void makeMove(Game game) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.print(name + ", Ваш ход (укажите ряд и столбец): ");
            row = scanner.nextInt() - 1; //т.к. начинается с 0
            col = scanner.nextInt() - 1; //т.к. начинается с 0
        } while (!game.isMoveValid(row, col));
        game.makeMove(row, col, getSymbol());
    }

    public void makeMoveComp(Game game) {
        Random random = new Random();
        int row;
        int col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!game.isMoveValid(row, col));
        System.out.println(getName() + " выбрал (ряд и столбец): " + (row + 1) + " " + (col + 1));
        game.makeMoveComp(row, col, getSymbol());
    }
}
