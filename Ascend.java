import java.util.Arrays;
import java.util.Collections;

public class Ascend {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 1, 2 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
