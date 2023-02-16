package other;

/**
 * Write a method named hasSharedDigit with 2 parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If of the numbers is not within the range, method should return false.
 *
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */

public class SharedDigit {

    public static boolean hasSharedDigit (int first, int second){
        if((first < 10 || first > 99) || (second < 10 || second > 99)){ //verify range of numbers
            return false;
        }
        //check if the two parameters have shared digits
        return (first % 10 == second % 10) || (first % 10 == second / 10) || (first / 10 == second % 10) || (first / 10 == second / 10);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }
}
