package javastarter.homework.tasks.task17;

public class Solution {

    public static void foo(String a, String b) {

        if (a.length() > b.length()) {
            System.out.println(a);
        } else if (a.length() < b.length()) {
            System.out.println(b);
        } else {
            System.out.println(a + ", " + b);
        }
    }
}
