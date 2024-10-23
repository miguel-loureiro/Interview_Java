package challenges;

import java.util.HashSet;
import java.util.Set;

public class Challenge11 {

    public static int findFirstDuplicate(int[] array) {

        Set<Integer> numerosVerificados = new HashSet<>(); //criar um Set para armazenar os numeros verificados

        for(int num : array) { // iterar sobre o array

            if(numerosVerificados.contains(num)) { //se o num já estiver no set de numeros verificados é um numero duplicado
                return num;
            } else {
                numerosVerificados.add(num); // adiciona o numero ao Set
            }
        }

        return -1; //se não encontrar duplicados
    }
}
