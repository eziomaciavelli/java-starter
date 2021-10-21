package javastarter.homework.tasks.task07;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//факториал
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int num = Integer.parseInt(reader.readLine());

        System.out.println(Factorial.findFactorial(num));

    }
}
