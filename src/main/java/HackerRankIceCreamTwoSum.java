import java.util.*;

public class HackerRankIceCreamTwoSum {

    public static List<Integer> getTwoMatchingValues(List<Integer> a, int m) {
        Map<Integer, Integer> addValues = new TreeMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i =0; i< a.size(); i++) {
            int y = m - a.get(i);
            Integer mapVal = addValues.get(y);
            if (mapVal != null) {
                result.add(mapVal +1);
                result.add(i + 1);
               break;
            }
            addValues.put(a.get(i), i);
        }
        return result;
    }
    public static void main(String ar[]) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> results = getTwoMatchingValues(input, 4);
        System.out.println("out put array::" + results );
    }

}
