package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */




public class GenericUtils {
        public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {
//           List list = convertSetToList(originalSet);
//            Character tempArray[] = new Character[originalSet.size()];
//            if(list.size()>2){
//               for (int i = 0; i <originalSet.size() ; i++) {
//                   String temArray[i]= new String[];
//               }
//           }
            return null;
        }

    public static <T> List<T> convertSetToList(Set<T> set)
    {
        // create an empty list
        List<T> list = new ArrayList<>();

        // push each element in the set into the list
        for (T t : set)
            list.add(t);

        // return the list
        return list;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
            Arrays.sort(originalSet);
            return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
        }
    }
