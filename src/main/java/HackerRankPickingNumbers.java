import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRankPickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int maxSubArrayLength = 0;

        for (int i =0; i < a.size(); i++) {
            List<Integer> pickNumbers = new ArrayList<>();
            int j = i+1;
            pickNumbers.add(a.get(i));
            while (j < a.size()) {
                int value = a.get(j)-a.get(i);
                if (Math.abs(value) <= 1) {
                    pickNumbers.add(a.get(j));
                }
                j++;
            }
            System.out.println(pickNumbers);
            if (maxSubArrayLength < pickNumbers.size()) {
                maxSubArrayLength = pickNumbers.size();
            }
            if (pickNumbers.size() >= (a.size()/2)) {
                break;
            }
        }

      return maxSubArrayLength;
    }

    public static void main(String... ar) {
        List array = Arrays.asList(1, 2,2, 3, 1, 2);
        System.out.println(pickingNumbers(array));
    }
}
