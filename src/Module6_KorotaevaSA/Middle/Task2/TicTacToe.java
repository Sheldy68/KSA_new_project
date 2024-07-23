package Module6_KorotaevaSA.Middle.Task2;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        /*
        Написать игру «крестики-нолики». Участвуют 2 игрока — вы и компьютер. Перед началом игры компьютер предлагает
        ввести ваше имя. Вы первый вводите номер ячейки и после каждого ввода должна отображаться сетка 3×3 в консоли
        с занятой вами ячейкой. Компьютер ходит после вас. Программа должна содержать классы и главный класс для
        запуска игры.
        Для этого создайте класс Player, объекты которого будут создаваться в начале игры, а так же нужен будет объект
        Game, в котором будут методы отрисовки поля и поиска победителя.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = scan.nextLine();

        Game game = new Game();
        Player user = new Player(name, 'X');
        Player computer = new Player("Компьютер", 'O');

        boolean userTurn = true;

            while (true) {
                //инициализация поля
                game.displayGame();
                //ход игрока
                if (userTurn) {
                    user.makeMove(game);
                } else {
                    computer.makeMoveComp(game);
                }
                //проверим, есть ли выигрыш уже
                if (game.isGameOver(user.getSymbol()) && game.isGameOver(computer.getSymbol())) {
                    System.out.println("Ничья!");
                    break;
                } else if (game.isGameOver(computer.getSymbol())) {
                    if (!userTurn) {
                        System.out.println("Победил компьютер!");
                    } else {
                        System.out.println("Победил игрок: " +  user.getName() + "!");
                    }
                    break;
                } else if (game.isGameOver(user.getSymbol())) {
                    if (userTurn) {
                        System.out.println("Победил игрок: " + user.getName() + "!");
                    } else {
                        System.out.println("Победил компьютер!");
                    }
                    break;
                }
                //переключаем очередь хода
                userTurn = !userTurn;
            }
        //итоговая отрисовка поля
        game.displayGame();
        }
    }

