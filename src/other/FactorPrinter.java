package other;

/**
 * Write a method named printFactors with one parameter of type int named number.
 * If number is > 1, the method should print "Invalid Value".
 * The method should print all factors of the number.
 * A factor of a number is an integer which divides that number wholly (without leaving a reminder)
 * EX: 3 is a factor of 6 because 3 fully divides 6 without leaving a reminder. In other words: 6 / 3 = 2
 */

public class FactorPrinter {

    public static void printFactors (int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
