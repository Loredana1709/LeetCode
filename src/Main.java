import easy.LongestCommonPrefix;

public class Main {
    public static void main(String[] args) {

        //easy.LongestCommonPrefix
        String [] array = {"flower","flow","flight"};
        String [] array1 = {"dog","racecar","car"};
        System.out.println("LongestCommonPrefix = " + LongestCommonPrefix.longestCommonPrefix(array));
        System.out.println("LongestCommonPrefix = " + LongestCommonPrefix.longestCommonPrefix(array1));
    }
}
