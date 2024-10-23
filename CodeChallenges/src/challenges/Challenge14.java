package challenges;

public class Challenge14 {

    public static boolean isSubstring(String str1, String str2) {

        int i = 0;
        int j = 0;

        // converter as strings para arrays de caracteres
        char[] s1Array = str1.toCharArray();
        char[] s2Array = str2.toCharArray();

        // percorrer os 2 arrays
        while (i < s1Array.length && j < s2Array.length) {
            // se os caracteres forem iguais então incrementar o index de str1
            if (s1Array[i] == s2Array[j]) {
                i++;
            }
            // incrementar sempre o index de str2
            j++;
        }

        // se todos os caracteres de str1 forem percorridos então retorna true
        return i == s1Array.length;
    }
}
