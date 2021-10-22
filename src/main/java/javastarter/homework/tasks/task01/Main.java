package javastarter.homework.tasks.task01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//вывод чисел прописью...
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        Convert.convertNumToWords(num);
    }
}