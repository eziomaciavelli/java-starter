package javastarter.homework.tasks.task04;

import java.util.Scanner;

public class Sum {

    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}