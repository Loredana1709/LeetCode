package other;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number
 * The method should return the sum of the even digits within the number
 * If the number is negative, the method should return -1 to indicate an invalid value
 *
 * EX: getEvenDigitSum(123456789) -> should return 20 since 2 + 4 + 6 + 8 = 20
 *     getEvenDigitSum(242) -> should return 4 since 2 + 2 = 4
 */

public class EvenDigitSum {

    public static int getEvenDigitSum (int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while (number != 0){
            int lastDigit = number % 10; //find last digit from number
            if(lastDigit % 2 == 0){ //check if lastDigit is even
                sum += lastDigit; //add it to the sum
            }
            number = number / 10; //remove the last digit from number
        }
        return sum;
    }
}
