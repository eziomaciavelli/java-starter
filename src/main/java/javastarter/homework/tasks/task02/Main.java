package javastarter.homework.tasks.task02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javastarter.homework.tasks.task02.Division.dividingByTwoDigit;

//числа которые делятся на 2...
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        dividingByTwoDigit(num);
    }
}
