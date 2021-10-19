package javastarter.homework.tasks.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//сумма введенных чисел...
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int num = Integer.parseInt(reader.readLine());

        int result = Sum.sumDigits(num);
        System.out.println("Сумма цифр равна: " + result);
    }
}
