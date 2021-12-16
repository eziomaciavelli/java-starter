package javastarter.homework.tasks.task18;

/*
Метод принимает 3 параметра, String a, String b, String c.
если А и Б содержит в себе букву C вернет true else false...
 */
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
