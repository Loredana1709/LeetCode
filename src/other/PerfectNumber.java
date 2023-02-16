package other;

/**
 * What is the perfect number?
 * A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * Proper positive divisor are positive integers that fully divide the perfect number without leaving a reminder and exclude the perfect number itself.
 * For example, take the number 6:
 * Its proper divisors are 1, 2 and 3 (since 6 is the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
 * Therefore, 6 is a perfect number (as well as the first perfect number).
 *
 * Write a method named isPerfectNumber with one parameter of type int named number.
 * If number is < 1, the method should return false.
 * The method must calculate if the number is perfect.
 * If the number is perfect, the method should return true; otherwise should return false.
 */
public class PerfectNumber {

    public static boolean isPerfectNumber (int number){
        if(number< 1){
            return false;
        }
        int sum = 0; //stores the sum of factors
        //find the factors of the number
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i; //calculate and store the sum of factors
            }
        }
        return sum == number; //compare the sum with number, if equal then number is perfect number
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}