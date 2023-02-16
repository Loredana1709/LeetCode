package easy;

import java.util.HashMap;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 *
 * There are six instances where subtraction is used:
 * - I can be placed before V (5) and X (10) to make 4 and 9.
 * - X can be placed before L (50) and C (100) to make 40 and 90.
 * - C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<String, Integer> singleSymbols = new HashMap<>();
        HashMap<String, Integer> subtracted = new HashMap<>();
        singleSymbols.put("I", 1);
        singleSymbols.put("V", 5);
        singleSymbols.put("X", 10);
        singleSymbols.put("L", 50);
        singleSymbols.put("C", 100);
        singleSymbols.put("D", 500);
        singleSymbols.put("M", 1000);

        subtracted.put("IV", 4);
        subtracted.put("IX", 9);
        subtracted.put("XL", 40);
        subtracted.put("XC", 90);
        subtracted.put("CD", 400);
        subtracted.put("CM", 900);

        int sum = 0;
        String temp;
        int i = 0;

        while(i< s.length()){
            if(i + 1 < s.length()){
                temp = String.valueOf(s.charAt(i)) + s.charAt(i + 1);
            }
            else{
                temp = "";
            }
            if(subtracted.containsKey(temp)){
                sum = sum + subtracted.get(temp);
                i = i+2;
                continue;
            }
            sum = sum + singleSymbols.get(String.valueOf(s.charAt(i)));
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("IX"));
    }
}
