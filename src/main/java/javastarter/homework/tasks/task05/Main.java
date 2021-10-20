package javastarter.homework.tasks.task05;


//поменять местами переменные, не используя третью переменную...
public class Main {
    public static void main(String[] args) {

        String a = "One";
        String b = "Two";

        a += b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
