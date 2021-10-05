/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit, so we don't want to process them, also we don't want to process negative numbers, so also return -1 for those.
 * Ex: sumDigits(125) should return 8 since 1+2+5=8
 *
 * HINT:
 *  Use n % 10 to extract the least-significant digit
 *  Use n = n / 10 to discard the least-significant digit
 */
public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-5));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(1205));
        System.out.println(sumDigits(64));

    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            int lastNumber = number % 10; //take last digit
            sum += lastNumber; //add last digit to the sum
            number = number / 10; //remove last digit from number
        }
        return sum;
    }
}
