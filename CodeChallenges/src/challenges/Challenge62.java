package challenges;

public class Challenge62 {

    public static boolean isPalindrome(String str) {

        // base case: se a string tiver 1 ou for vazia é um palindromo
        if(str.length() <= 1 ) {

            return true;
        }

        // converter a string em minusculas
        str = str.toLowerCase();

        // comparar o primeiro e ultimo caractere
        if(str.charAt(0) != str.charAt(str.length() - 1)) {

            return false;
        }

        // funçao recursiva: verificar a substring sem o primeiro e ultimo caracter
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
