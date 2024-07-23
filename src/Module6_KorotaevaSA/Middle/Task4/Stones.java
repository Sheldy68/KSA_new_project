package Module6_KorotaevaSA.Middle.Task4;

import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        /*
        Написать игру «Камешки».
        Правила следующие: играют 2 игрока, компьютер загадывает число от 1 до 100. Каждый игрок вводит с клавиатуры
        число, а компьютер суммирует числа игроков. Если игрок загадал число и оно в сумме дало больше, чем загадал
        компьютер, то этот игрок проиграл.
        Пример: компьютер загадал число 48.
        Первый игрок вводит 30
        Второй игрок вводит 10 ; // суммарно 40
        Первый игрок вводит 9 ; // суммарно 49 > 48 Первый игрок проиграл.
        Игра должна быть написана в ООП стиле, с использованием классов и методов. Для этого создайте класс Player,
        у которого будет имя и текущий счётчик побед. После завершения игры компьютер выводит победителя и его
        результат.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        String name1 = scan.nextLine();
        System.out.println("Введите имя второго игрока:");
        String name2 = scan.nextLine();

        GameStones game = new GameStones();
        PlayerStones player1 = new PlayerStones(name1);
        PlayerStones player2 = new PlayerStones(name2);

        //переключатель между игроками, проверяем по первому игроку
        boolean player1Turn = true;
        //счетчик чисел игроков
        int total = 0;
        int totalPrevious = 0; // количество очков на предыдущем игроке

        while (total <= game.getComputerNumber()) {
            int move;
            totalPrevious = total;
            if (player1Turn) {
                move = player1.makeMove();
            } else {
                move = player2.makeMove();
            }
            total = total + move;
            if (total > game.getComputerNumber()) {
                if (player1Turn) {
                    System.out.println("Игрок " +  player1.getName() + " - проиграл!");
                    System.out.println("Победил игрок " +  player2.getName() + " на счете " + totalPrevious);
                } else {
                    System.out.println("Игрок " +  player2.getName() + " - проиграл!");
                    System.out.println("Победил игрок " +  player1.getName() + " на счете " + totalPrevious);
                }
                break;
            }
            //переключаем очередь хода
            player1Turn = !player1Turn;
        }
        System.out.println("Итоговый счет: " + total);
        System.out.println("Загаданное число: " + game.getComputerNumber());

    }
}
