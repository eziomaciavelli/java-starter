package javastarter.homework.tasks.task03;

public class Prime {

    public static void checkPrime(int num) {
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
