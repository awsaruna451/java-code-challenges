import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HackerRankMiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min =arr.get(0), max =0, sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
            if (max < arr.get(i)) {
                max = arr.get(i);
            }

        }
        System.out.println((sum-max) + " "+ (sum-min));
    }

    public static void main(String... ar) {
        List array = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(array);
    }

}
