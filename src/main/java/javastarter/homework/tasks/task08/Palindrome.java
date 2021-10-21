package javastarter.homework.tasks.task08;


public class Palindrome {

    public static void isPalindrome(String word) {

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String s = sb.toString();

        if (word.equalsIgnoreCase(s)) {
            System.out.println(word + " - is palindrome");
        } else {
            System.out.println(word + " - is not palindrome");
        }
    }
}
