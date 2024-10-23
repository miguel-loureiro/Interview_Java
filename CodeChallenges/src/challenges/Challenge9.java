package challenges;

public class Challenge9 {

    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {

                left = mid + 1;
            } else if (array[mid] > target) {

                right = mid -1;
            }
        }
        return -1;
    }
}
