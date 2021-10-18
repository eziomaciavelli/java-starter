package javastarter.homework.tasks.task02;

public class Division {

    public static void dividingByTwoDigit(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}