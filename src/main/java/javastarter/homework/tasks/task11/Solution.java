package javastarter.homework.tasks.task11;

public class Solution {

    public static void power(int a, int b, int c) {

        for (int i = 1; i <= b; i++) {
            double result = Math.pow(a, c);
            a++;
            System.out.println(i + "^" + c + " = " + result);
        }
    }
}
