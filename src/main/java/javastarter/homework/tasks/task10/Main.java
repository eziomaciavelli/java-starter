package javastarter.homework.tasks.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*введите N раз количество символов,
 если true напечатать через строку, если false в одну строку*/
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите количество итерации: ");
        int count = Integer.parseInt(reader.readLine());

        System.out.print("Введите вариант вывода (true или false): ");
        String s = reader.readLine();

        System.out.print("Введите символ: ");
        char ch = (char) reader.read();

        Solution.foo(count, ch, s);

    }
}
