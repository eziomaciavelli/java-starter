package javastarter.homework.tasks.task09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//проверка на палиндром введенных чисел...
public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int num = Integer.parseInt(reader.readLine());

        boolean result = Palindrome.isPalindrome(num);

        System.out.println(result);
    }
}
