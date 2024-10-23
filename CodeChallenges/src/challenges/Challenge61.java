package challenges;

public class Challenge61 {

    public static boolean isPalindrome(String str) {
        // converter a string em minusculas
        str = str.toLowerCase();

        // inicializar 2 indexes: um no incio e outro no final
        int left = 0;
        int right = str.length() - 1;

        // comparar os valores enquanto left <= right
        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                return false;
            }
            left++;
            right--;
        }
        // se todos os caracteres de left e de right forem iguais então é palindromo
        return true;
    }
}
