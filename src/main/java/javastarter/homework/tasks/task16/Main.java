package javastarter.homework.tasks.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//foo(“Hello”, ‘c’, 5); -> Helloccccc
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите слово: ");
        String s = reader.readLine();
        System.out.print("Введите символ: ");
        char c = reader.readLine().charAt(0);
        System.out.print("Введите число итерации: ");
        int count = Integer.parseInt(reader.readLine());

        Solution.foo(s, c, count);
    }
}
