package challenges;

// reverter uma string com StringBuilder (que já permite reverse())
public class Challenge22 {

    public static String reverseString(String str) {

        StringBuilder strrev = new StringBuilder();

        strrev.append(str);
        strrev.reverse();

        return strrev.toString();
    }
}
