/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example:
 * Input: x = 123
 * Output: 321
 */

public class ReverseInteger {

    public static int reverse(int x) {
        if (x == 0){
            return 0;
        }
        long reversed = 0;
        while(x != 0){
            int reminder = x % 10; // this gives us the last digit e.g: if 123, with this we get 3
            reversed = reversed * 10 + reminder; // multiply the variable reverse by 10 and add the reminder into it, e.g.: if we have 123,
            //after the first step we have 3, with this last one, we'll have 32
            x = x / 10; //divide by 10 to get the rest of digits that have to be reversed
        }
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469)); // output 0
        System.out.println(reverse(-123)); //output -321
        System.out.println(reverse(120)); //output 21
        System.out.println(reverse(0)); //output 0
    }
}
