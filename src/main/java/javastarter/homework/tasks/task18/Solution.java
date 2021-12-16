package javastarter.homework.tasks.task18;

public class Solution {

    public static boolean foo(String a, String b, String c) {

        for (int i = 0; i <= a.length(); i++) {
            if (a.contains("C") && b.contains("C")) {
                return true;
            }
        }
        return false;
    }
}
