package javastarter.homework.tasks.task07;

public class Factorial {

    public static int findFactorial(int num) {

        if (num == 0) {
            return 1;
        }
        return num * findFactorial(num - 1);
    }
}
