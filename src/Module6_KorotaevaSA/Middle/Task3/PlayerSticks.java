package Module6_KorotaevaSA.Middle.Task3;

import java.util.Random;
import java.util.Scanner;

public class PlayerSticks {
    private String name;

    public PlayerSticks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int makeMoveSticks() {
        Scanner scanner = new Scanner(System.in);
        int sticks = 0;
        while (sticks < 1 || sticks > 3) {
            System.out.print(name + ", укажите число палочек от 1 до 3:");
            sticks = scanner.nextInt();
        }
        return sticks;
    }

    public int makeMoveSticksComp() {
        int sticks;
        Random random = new Random();
        sticks = random.nextInt(3) + 1;
        System.out.println("Ход компьтера: " + sticks);
        return sticks;
    }
}
