package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if (isPalindrome(string.substring(i, j))) {
                    palindromes.add(string.substring(i, j));
                }
            }
        }

       String[] array =  new String[palindromes.size()];
        int i = 0;
        for(String s : palindromes)
            array[i++] = s;
        return array;
    }

    public static Boolean isPalindrome(String string) {
        char[] s = string.toCharArray();
        int i1 = 0;
        int i2 = string.length()-1;
        while (i2 > i1) {
            if (s[i1] != s[i2]) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }


    public static String reverseString(String string) {
       return new StringBuilder(string).reverse().toString();
    }
}
