package javastarter.homework.tasks.task09;

public class Palindrome {

    public static boolean isPalindrome(int num) {

        String s = String.valueOf(num);
        String reverse = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != reverse.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
