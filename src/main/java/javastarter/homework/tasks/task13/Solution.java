package javastarter.homework.tasks.task13;

public class Solution {

    public static boolean checkNumEquals(int a, int b, int c, int d) {
        if (a == b || a == c || a == d || b == c || b == d) {
            return true;
        }
        return false;
    }
}
