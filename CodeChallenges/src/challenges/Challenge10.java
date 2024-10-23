package challenges;

public class Challenge10 {

    public static int[] mergeSort(int[] array) {

        // base case: se o array tem 1 ou é vazio então já está ordenado
        if(array.length <= 1 ) {
            return array;
        }

        int midIndex = array.length / 2;  // encontrar o ponto medio

        // separar em 2 arrays (left e right)
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[array.length - midIndex];

        for(int i = 0; i < midIndex; i++) { // popular os arrays anteriores com os valores
            leftArray[i] = array[i];
        }
        for(int i= midIndex; i < array.length; i++) {
            rightArray[i - midIndex] = array[i];
        }

        int[] leftSorted = mergeSort(leftArray);
        int[] rightSorted = mergeSort(rightArray);

        return merge(leftSorted, rightSorted);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] mergedArray = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;

        // fazer merge dos arrays left e right
        while(leftIndex < left.length && rightIndex < right.length) {

            if(left[leftIndex] < right[rightIndex]) {

                mergedArray[mergeIndex] = left[leftIndex];
                leftIndex++;
            } else {

                mergedArray[mergeIndex] = right[rightIndex];
                rightIndex++;
            }

            mergeIndex++;
        }

        // juntar os elementos que podem ter sobrado do array left
        while(leftIndex < left.length) {
            mergedArray[mergeIndex] = left[leftIndex];
            leftIndex++;
            mergeIndex++;
        }

        // juntar os elementos que podem ter sobrado do array right
        while(rightIndex < right.length) {
            mergedArray[mergeIndex] = right[rightIndex];
            rightIndex++;
            mergeIndex++;
        }

        return mergedArray;
    }
}
