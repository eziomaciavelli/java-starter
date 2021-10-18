package javastarter.homework.tasks.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//нахождение простых чисел Java
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        Prime.checkPrime(num);
    }
}
