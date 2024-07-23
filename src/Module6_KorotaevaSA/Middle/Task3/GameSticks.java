package Module6_KorotaevaSA.Middle.Task3;

public class GameSticks {
    private int sticks;
    //конструктор. Инициализация числа палочек
    public GameSticks(int initialSticks) {
        sticks = initialSticks;
    }
    //отрисовка остатка палочек
    public void displaySticks() {
        System.out.println("Оставшиеся палочки: " + sticks);
        for (int i = 0; i < sticks; i++) {
            System.out.print("| ");
        }
        System.out.println();
    }
    //ход игрока
    public void removeSticks(int numSticks) {
        if (numSticks >= 1 && numSticks <= 3) {
            sticks = sticks - numSticks;
        } else {
            System.out.println("Укажите число палочек от 1 до 3");
        }
    }
    //проверка на окончание игры. Конец, если осталась 1 палочка
    public boolean isGameOver() {
        return sticks <= 1;
    }
}
