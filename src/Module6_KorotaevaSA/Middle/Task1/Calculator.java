package Module6_KorotaevaSA.Middle.Task1;

import java.util.Scanner;

public class Calculator {
    /*
    Написать программу-калькулятор, у которого есть 4 метода: сложение, вычитание, умножение и деление.
    Каждый метод принимает на вход 2 параметра.
    Программа предлагает сначала выбрать действие (ввести с консоли), а затем ввести последовательно два аргумента.
    Например:
    Введите действие: +
    Введите первый аргумент: 10
    Введите второй аргумент: 15
    Результат: 25
     */
    public static void main(String[] args) {
        double number1;
        double number2;
        double result = 0;
        String action;

        System.out.println("Введите действие:");
        action = getAction();
        System.out.println("Введите первый аргумент:");
        number1 = getNumber();
        System.out.println("Введите второй аргумент:");
        number2 = getNumber();

        switch (action) {
            case "+":
                result = add(number1, number2);
                break;
            case "-":
                result = substract(number1, number2);
                break;
            case "*":
                result = multiply(number1, number2);
                break;
            case "/":
                if(number2 > 0) {
                    result = divide(number1, number2);
                } else {
                    System.out.println("Делить на 0 нельзя");
                }
                break;
            default:
                System.out.println("Некорректная операция");
        }
        System.out.println("Результат: " + result);
    }
    //получить действие с консоли
    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        return action;
    }
    //получить число с консоли
    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        return number;
    }
    //сложение
    public static double add (double number1, double number2) {
        double result;
        result = number1 + number2;
        return result;
    }
    //вычитание
    public static double substract (double number1, double number2) {
        double result;
        result = number1 - number2;
        return result;
    }
    //умножение
    public static double multiply (double number1, double number2) {
        double result;
        result = number1 * number2;
        return result;
    }
    //деление
    public static double divide (double number1, double number2) {
        double result;
        result = number1 / number2;
        return result;
    }
}
