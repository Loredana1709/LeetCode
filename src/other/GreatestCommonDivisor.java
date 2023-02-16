package other;

/**
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 * The method should return the greatest common divisor of the two numbers (int).
 * The greatest common divisor is the largest positive integer than can fully divide each of the integers (without leaving a reminder)
 *
 * EX: 12 can be divided by 1,2, 3, 4, 6, 12
 *     30 can be divided by 1,2, 3, 5, 6, 10, 15, 30
 *     The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting reminder.
 */

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second){
        if(first < 10 || second < 10){ //check range of first and second
            return -1;
        }
        int gcd = 0; //greatest common divisor variable
        // the for loop is running from 1 to the smallest of both numbers (first or second)
        // all the numbers from 1 to the smallest between first and second will be checked
        for(int i = 1; i <= first && i <= second; i++){
            if(first % i == 0 && second % i == 0){ // the number that perfectly divides both numbers would be gcd
                gcd = i; //using this loop, we'll be able to find the largest number that divides the both numbers
            }
        }
        return gcd;
    }
}
