import java.util.stream.IntStream;

/**
 * Write a method named hasSameLastDigit with three parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 * The method should return true if at least 2 of the numbers share the same rightmost digit, otherwise it should return false.
 * EX: hasSameLastDigit(41, 22, 71) -> should return true as 1 is the rightmost digit in number 41 and 71
 *
 * Write another method names isValid with one parameter of type int.
 * The method needs to return true if the number parameter is in range 10 (inclusive) - 1000 (inclusive), otherwise return false.
 */

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z){
        if(IntStream.of(x, y, z).anyMatch(a -> a < 10 || a > 1000)){ //check if x, y, z are in range of 10-1000
            return false;
        }
        return (x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10);
    }

    public static boolean isValid (int number){
        return (number >= 10) && (number <= 1000);
    }

    public static void main(String[] args) {
        System.out.println(isValid(9));
        System.out.println(hasSameLastDigit(41, 22, 71));
    }
}
