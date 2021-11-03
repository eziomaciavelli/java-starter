package javastarter.homework.tasks.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//foo(1,5,2) -> 1^2=1; 2^2=4; 3^2=9, 4^2=16, 5^2=25
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число для возведение: ");
        int a = Integer.parseInt(reader.readLine());

        System.out.print("Введите количество итерации: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.print("Возведение в степень: ");
        int c = Integer.parseInt(reader.readLine());

        Solution.power(a, b, c);
    }
}
