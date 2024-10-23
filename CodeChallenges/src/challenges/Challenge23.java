package challenges;

public class Challenge23 {

    public static String reverseString(String str) {

        char[] reversi = str.toCharArray();

        int left = 0;
        int right = reversi.length -1;

        while(left<right) {

            char temp = reversi[left];
            reversi[left] = reversi[right];
            reversi[right] = temp;

            left++;
            right--;
        }
        return new String(reversi);
    }
}
