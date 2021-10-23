package javastarter.homework.tasks.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число для возведение: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Введите число итерации возведенного числа: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("Возведение в степень: ");
        int c = Integer.parseInt(reader.readLine());

        Solution.power(a, b, c);
    }
}
