package easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 */

public class Palindrome {

    public static boolean isPalindrome(int x) {
        int reversed = 0;
        int temp = x;
        while(x > 0){
            int reminder = x % 10;
            reversed = reversed * 10 + reminder;
            x = x / 10;
        }
        return temp == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}

