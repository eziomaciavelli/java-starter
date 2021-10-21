package javastarter.homework.tasks.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//проверка на палиндром...
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите слово: ");
        String s = reader.readLine();

        Palindrome.isPalindrome(s);
    }
}
