package javastarter.homework.tasks.task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//метод принимает два слова, и вернет самую длинную...
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое слово: ");
        String a = reader.readLine();
        System.out.print("Введите второе слово: ");
        String b = reader.readLine();

        Solution.foo(a,b);
    }
}
