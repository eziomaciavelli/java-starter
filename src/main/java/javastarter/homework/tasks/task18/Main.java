package javastarter.homework.tasks.task18;

/*
Метод принимает 3 параметра, String a, String b, String c.
если А и Б содержит в себе букву C вернет true else false...
 */


import static javastarter.homework.tasks.task18.Solution.foo;

public class Main {
    public static void main(String[] args) {

        boolean b = foo("Camera", "Circle", "Apple");
        System.out.println(b);
    }
}
