package challenges;

public class Challenge3 {

    public static int findMaxValue(int[] numbers) {
        // Inicializar max com o primeiro elemento do array
        int max = numbers[0];

        // iterar sobre o array a partir do segundo elemento
        for (int i = 1; i < numbers.length; i++) {
            // se o elemento atual é maior que max então atualizar max
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // retorna o valor de max
        return max;
    }
}
