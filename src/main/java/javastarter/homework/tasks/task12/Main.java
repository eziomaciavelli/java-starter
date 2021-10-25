package javastarter.homework.tasks.task12;


//если число отрицательное ввести -1, положительное 1, если 0 ввести 0...
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Solution.checkNum(num));
    }
}
