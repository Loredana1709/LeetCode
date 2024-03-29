package other;

/**
 * Write a method called isOdd with an int parameter and call it number. The method needs to return boolean.
 * Check that number is > 0, if it is not return false.
 * If number is odd return true, otherwise return false.
 *
 * Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
 * The method should use a for loop to sum all the odd numbers in that range including the end and return the sum.
 *
 * It should call the method isOdd to check if each number is odd.
 * The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
 */

public class SumOdd {
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        return number % 2 != 0;
    }


    public static int sumOdd (int start, int end){
        int sum = 0;
        if(end < start || start < 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(24));
        System.out.println(sumOdd(-4,6));
    }
}
