package javastarter.homework.tasks.task15;

import java.util.Scanner;

//сравнивание двух переменных если одинаково вернуть true, else false...
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String firstText = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String secondText = scanner.nextLine();

        System.out.println(Solution.checkEquals(firstText, secondText));
    }
}
