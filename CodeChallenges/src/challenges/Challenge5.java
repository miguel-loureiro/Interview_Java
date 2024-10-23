package challenges;

import java.util.HashSet;
import java.util.Set;

public class Challenge5 {

    public static boolean haveSameElements(int[] array1, int[] array2 ) {

        // se os arrays tiverem tamanhos diferentes quer dizer que não têm os mesmos elementos
        if (array1.length != array2.length) {

            return false;
        }
        // converter os arrays em Set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        //adicionar os elementos dos 2 arrays aos respectivos sets
        for(int num: array1) {
            set1.add(num);
        }

        for(int num: array2) {
            set2.add(num);
        }

        return set1.equals(set2);
    }
}
