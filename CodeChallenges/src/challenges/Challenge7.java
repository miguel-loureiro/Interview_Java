package challenges;

import java.util.Arrays;

public class Challenge7 {

    public static boolean isAnagram(String str1, String str2) {

            // se os tamanhos forem diferentes não são anagramas
            if(str1.length() != str2.length()) {

                return false;
            }
            // converter as 2 strings para minusculas
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // converter os 2 arrays em arrays de caracteres
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // ordenar os 2 arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // compare os arrays ordenados
            return Arrays.equals(charArray1, charArray2);
        }
    }
