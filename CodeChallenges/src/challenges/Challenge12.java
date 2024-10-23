package challenges;

public class Challenge12 {

    public static boolean validateIPAddress(String ip) {
        // "partir" o IP adress em partes usando o "." como separador
        String[] partes = ip.split("\\.");

        // verificar se IP tem 4partes
        if (partes.length != 4) {
            return false;
        }

        // iterar sobre cada parte do IP address
        for (String elemento : partes) {
            try {
                // converter a string para um integer
                int numero = Integer.parseInt(elemento);

                // verificar se o numero está entre 0 e 255
                if (numero < 0 || numero > 255) {
                    return false;
                }

                // verificar se a representacao string do  numero é igual ao elemento original
                // para assegurar que não temos 0 à esquerda (por ex., "01" será invalido)
                if (!elemento.equals(String.valueOf(numero))) {
                    return false;
                }
            } catch (NumberFormatException e) {
                // se a conversão de string para inteiro falhar então não é um numero válido
                return false;
            }
        }

        // se tudo passar atá aqui então o IP é válido
        return true;
    }
}
