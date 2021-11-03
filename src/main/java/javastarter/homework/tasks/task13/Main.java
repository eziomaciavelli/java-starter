package javastarter.homework.tasks.task13;

import java.util.Scanner;

/*метод checkNumEquals принимает 4 целых чисел,
если хотяб двое из них равны метод возвращает true, else false*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(Solution.checkNumEquals(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
