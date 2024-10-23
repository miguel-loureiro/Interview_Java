package challenges;

import java.util.HashSet;
import java.util.Set;

public class Challenge4 {

    public static int[] unique(int[] numbers) {
        // criar um Set para armazenar os elementos unicos
        Set<Integer> uniqueSet = new HashSet<>();

        // adicionar os elementos do array ao Set (os duplicados vão ser ignorados)
        for (int number : numbers) {
            uniqueSet.add(number);
        }

        // converter o Set para um array
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (Integer num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
