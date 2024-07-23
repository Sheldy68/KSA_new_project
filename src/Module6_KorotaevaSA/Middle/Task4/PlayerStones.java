package Module6_KorotaevaSA.Middle.Task4;

import java.util.Scanner;

public class PlayerStones {
    private String name;

    public PlayerStones(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int makeMove() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print(name + ", введите число: ");
        number = scanner.nextInt();
        return number;
    }
}
