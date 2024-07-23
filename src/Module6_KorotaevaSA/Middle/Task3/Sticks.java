package Module6_KorotaevaSA.Middle.Task3;

import java.util.Scanner;

public class Sticks {
    public static void main(String[] args) {
        /*
        Написать игру «Палочки». Играют два игрока (вы и компьютер). В консоли компьютер выводит 20 палочек.
        По очереди игрок и компьютер должны снимать 1, 2 или 3 палочки. Каждый шаг компьютер отрисовывает оставшиеся
        палочки в консоль. Победителем считается тот, кто оставил своему оппоненту одну палочку.
         */
        final int maxSticks = 20;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scan.nextLine();

        GameSticks game = new GameSticks(maxSticks);
        PlayerSticks user = new PlayerSticks(name);
        PlayerSticks computer = new PlayerSticks("Компьютер");

        boolean userTurn = true;

        //выполняем, пока палочек больше 1ой
        while (!game.isGameOver()) {
            int sticksRemove;
            game.displaySticks();
            //сколько палочек будем убирать
            if (userTurn) {
                sticksRemove = user.makeMoveSticks();
            } else {
                sticksRemove = computer.makeMoveSticksComp();
            }
            //убираем палочки
            game.removeSticks(sticksRemove);
            //переключаем очередь хода
            userTurn = !userTurn;
        }
        //финальное число палочек
        game.displaySticks();
        if (userTurn) {
            System.out.println("Победил игрок: " + user.getName() + "!");
        } else {
            System.out.println("Победил компьютер!");
        }
    }
}
