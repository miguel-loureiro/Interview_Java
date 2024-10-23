package challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge81 {

    public static String caeserCipher(String str, int shift) {
        // criar array de alfabeto
        List<Character> alfabeto = new ArrayList<>();
        for (char c = 'a'; c<= 'z'; c++) {
            alfabeto.add(c);
        }

        // converter a string em minusculas
        str = str.toLowerCase();

        // inicializar a string codificada após aplicar a caeserCipher.
        // como String é imutavel, tem que se usar um StringBuilder
        StringBuilder strCodificada = new StringBuilder();

        // iterar sobre cada caractere da string inicial
        for(int i = 0; i < str.length(); i++) {
           char charAt = str.charAt(i);

           //obter o indice do caractere atual
            int index = alfabeto.indexOf(charAt);
            // se o caractere é encontrado no alfabeto
            if(index != -1) {
                // calcular o caratere "deslocado"
                int shiftedIndex = (index + shift) % alfabeto.size();
                // adicionar o caractere deslocado a strCodificada
                strCodificada.append(alfabeto.get(shiftedIndex));
            } else {
                // adicionar caracteres diferentes não incluidos no alfabeto (espaços, pontuacao)
                strCodificada.append(charAt);
            }
        }
        return  strCodificada.toString();
    }
}
