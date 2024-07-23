package Module6_KorotaevaSA.Middle.Task4;

import java.util.Random;

public class GameStones {
    private int computerNumber;
    final int maxNmber = 100;

    //конструктор. Инициализация числа, загаданного компьютером
    public GameStones() {
        Random random = new Random();
        computerNumber = random.nextInt(maxNmber) + 1;
    }

    public int getComputerNumber() {
        return computerNumber;
    }
}
