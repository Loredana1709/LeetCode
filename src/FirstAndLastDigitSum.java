/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 *
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 *
 * Ex: sumFirstAndLastDigit(252) = return 4 ->first digit 2 and last digit 2
 *     sumFirstAndLastDigit(257) = return 9 -> first digit 2 and last digit 7
 *     sumFirstAndLastDigit(0) = return 0 -> first and last digit is 0 since we only have one digit (same for all single digits)
 */
public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(6));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        int sum;

        if(number < 0){
            return -1;
        }

        if(number < 10){
            return number * 2;
        }

        int last = number % 10; //take last digit

        int first = 0;
        //to find first digit of a number we divide the given number by 10 until number is greater than 10
        //like that, at the end, when the first loop is made, we are left with the first digit
        while(number >= 10){ //while loop to take first digit
            number /= 10;
            first = number;
        }
        sum = first + last;
        return sum;
    }
}
