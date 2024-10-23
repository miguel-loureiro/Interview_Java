package challenges;

import java.util.HashMap;
import java.util.Map;

public class Challenge82 {

    public static String caeserCipher(String str, int shift) {
        // criar um map para armazenar os caracteres "deslocados"
        Map<Character, Character> cipherMap = new HashMap<>();
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // popular o map com os caracteres "deslocados"
        for (int i = 0; i < alfabeto.length; i++) {
            char shiftedChar = alfabeto[(i + shift) % alfabeto.length];
            cipherMap.put(alfabeto[i], shiftedChar);
        }
        // "construir" a string com a cifra
        StringBuilder strCifrada = new StringBuilder();
        str = str.toLowerCase();

        for(char ch : str.toCharArray()) {
            // adicionar o caracteres deslocado se for encontrado,
            // ou adicionar por default o proprio (se for um espaço ou pontuacao)
            strCifrada.append(cipherMap.getOrDefault(ch, ch));
        }
        return strCifrada.toString();
    }
}
