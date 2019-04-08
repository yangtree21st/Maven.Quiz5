package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        Set<String> list = new HashSet<>();
        for (int i = 0; i < string.length(); i++)
            for (int j = i + 1; j <= string.length(); j++) {
                list.add(string.substring(i, j));
            }
        return convertStoArray(list);
//        String[] array = new String[list.size()];
//            int i = 0;
//            for(String ele :list){
//                array[i++] = ele;
//            }
//            return array;
    }

    public static String[] convertStoArray(Set<String> set) {
        String[] array = new String[set.size()];
        int i = 0;
        for (String ele : set) {
            array[i++] = ele;
        }
        return array;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> list = new HashSet<>();
        String[] array1 = getAllSubstrings(string1);
        String[] array2 = getAllSubstrings(string2);
        for (int i = 0; i < array1.length; i++)
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    list.add(array1[i]);
                }
            }
        return convertStoArray(list);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] array = getCommonSubstrings(string1, string2);
        int index = 0;
        int tempLength = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > tempLength) {

                tempLength = array[i].length();
                index = i;
            }
        }
        return array[index];
    }
}
