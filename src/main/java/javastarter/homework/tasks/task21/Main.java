package javastarter.homework.tasks.task21;

import java.util.Scanner;

import static javastarter.homework.tasks.task21.Calculator.*;

//calculator app
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый операнд: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второй операнд: ");
        int lastNumber = scanner.nextInt();

        System.out.print("Выберите операцию: *, /, +, - : ");
        String operations = scanner.next();

        switch (operations) {
            case "*":
                System.out.println(firstNumber + " * " + lastNumber + " = " + mul(firstNumber, lastNumber));
                break;
            case "/":
                if (lastNumber == 0) {
                    System.out.println("Деление на ноль запрещено!");
                } else {
                    System.out.println(firstNumber + " / " + lastNumber + " = " + div(firstNumber, lastNumber));
                }
                break;
            case "+":
                System.out.println(firstNumber + " + " + lastNumber + " = " + add(firstNumber, lastNumber));
                break;
            case "-":
                System.out.println(firstNumber + " - " + lastNumber + " = " + sub(firstNumber, lastNumber));
                break;
            default:
                System.out.println("Ошибка. Арифметическая операция введено неверно " +
                        "проверьте коррекность операции.");
        }
    }
}
