package Module6_KorotaevaSA.Middle.Task2;

public class Game {
    private char[][] game;
    final int max_3 = 3;  // для обозначения поля 3 * 3
    final int borderCount = 2;  // для обозначения границ поля

    //конструктор
    public Game() {
        //массив для ходов игроков
        game = new char[max_3][max_3];
        //пустое поле 3*3
        for (int i = 0; i < max_3; i++) {
            for (int j = 0; j < max_3; j++) {
                game[i][j] = ' ';
            }
        }
    }
    //отрисовка поля после хода игрока
    public void displayGame() {
        for (int i = 0; i < max_3; i++) {
            for (int j = 0; j < max_3; j++) {
                System.out.print(game[i][j]);
                if (j < borderCount) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < borderCount) {
                System.out.println("---------");
            }
        }
    }
    //запись хода игрока в клетку
    public void makeMove(int row, int col, char symbol) {
        game[row][col] = symbol;
    }
    //запись хода компьютера в клетку
    public void makeMoveComp(int row, int col, char symbol) {
        game[row][col] = symbol;
    }
    //проверка указанного хода
    public boolean isMoveValid(int row, int col) {
        //если клетка была пустая, значит ход валидный
        return row >= 0 && row < max_3 && col >= 0 && col < max_3 && game[row][col] == ' ';
    }
    //проверка на окончание игры
    public boolean isGameOver(char symbol) {
        for (int i = 0; i < max_3; i++) {
            //по горизонтали все клетки
            if ((game[i][0] == symbol && game[i][1] == symbol && game[i][2] == symbol) ||
                    //по вертикали все клетки
                    (game[0][i] == symbol && game[1][i] == symbol && game[2][i] == symbol)) {
                return true;
            }
        }
        //по обеим диагоналям все клетки
        if ((game[0][0] == symbol && game[1][1] == symbol && game[2][2] == symbol) ||
                (game[0][2] == symbol && game[1][1] == symbol && game[2][0] == symbol)) {
            return true;
        }
        //если еще есть пустая клетка
        for (int i = 0; i < max_3; i++) {
            for (int j = 0; j < max_3; j++) {
                if (game[i][j] == ' ') {
                    return false;
                }
            }
        }
        //клетки закончились, игра окончена
        return true;
    }
}
