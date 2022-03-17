import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRankMinimumDistance {

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int distance = -1;
        List<Integer> indices = new ArrayList<>();
        for(int i = 0; i < a.size(); i++) {
            int initialValue = a.get(i);
            int j = i+1;
            while(j < a.size()) {
                if (initialValue == a.get(j)) {
                    indices.add(Math.abs(j-i));
                    break;
                }
                j++;
            }
        }
        if (indices.size() > 0) {
            Collections.sort(indices);
            distance = indices.get(0);
        }
      return distance;
    }

    public static void main(String... a) {
        List req = Arrays.asList(7, 1, 3, 4, 1, 7);
        System.out.println(minimumDistances(req));
    }
}
