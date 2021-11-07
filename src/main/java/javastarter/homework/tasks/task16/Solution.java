package javastarter.homework.tasks.task16;

public class Solution {

    public static void foo(String s, char c, int count) {

        StringBuilder sBuilder = new StringBuilder(s);
        for (int i = 0; i < count; i++) {
            sBuilder.append(c);
        }
        s = sBuilder.toString();
        System.out.println(s);
    }
}
