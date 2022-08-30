import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithmDigits {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
        int[] secondDigits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigitsS(digits));
    }

    private static String maxNumberFromDigits(int[] digits) {
        Arrays.sort(digits);

        StringBuilder result = new StringBuilder();

        for (int i = digits.length - 1; i >= 0 ; i--)
            result.append(digits[i]);

        return result.toString();
    }

    private static String maxNumberFromDigitsS(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }
}
