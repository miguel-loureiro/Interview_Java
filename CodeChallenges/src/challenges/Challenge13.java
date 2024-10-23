package challenges;

public class Challenge13 {

    public static int binaryGap(int num) {

        // convert num para binário
        String binaryString = Integer.toBinaryString(num);

        // inicializar maxGap e ultimoUm index
        int maxGap = 0;
        Integer ultimoIndexDeUm = null;

        // iterar sobre o binario
        for( int index = 0; index < binaryString.length(); index++) {

            char caractereAtual = binaryString.charAt(index);

            // verificar se o caractere é "1"
            if(caractereAtual == '1') {
                // se o ultimoIndexDeUm não é null tem que se calcular o gap
                if(ultimoIndexDeUm != null) {

                    maxGap = Math.max(maxGap, index - ultimoIndexDeUm - 1);
                }
                ultimoIndexDeUm = index; // atualizar o ultimoIndexDeUm
            }
        }
        return maxGap; // return o gap maximo
    }
}
