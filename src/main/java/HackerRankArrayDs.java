import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankArrayDs {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> reverseArray = new ArrayList<>();
        for (int i =0; i < a.size(); i++) {
            reverseArray.add(a.get(a.size()-1-i));
        }
     return reverseArray;
    }
    public static void main(String... ar) {
        List array = Arrays.asList(1, 4, 3, 2);
        System.out.println("reverse::"+reverseArray(array));
    }
}
