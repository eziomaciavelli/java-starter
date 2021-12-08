package javastarter.homework.tasks.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//нахождение символа с помощью индекса...
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите слово: ");
        String s = reader.readLine();

        System.out.print("Введите индекс: ");
        int num = Integer.parseInt(reader.readLine());


        Solution.findSymbol(s,num);
    }
}
