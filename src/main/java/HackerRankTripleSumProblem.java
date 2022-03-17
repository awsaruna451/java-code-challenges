import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerRankTripleSumProblem {

    public static int tripleCount(int[] a, int[] b, int[] c) {
        int[] distinctA = removeDuplicate(a);
        int[] distinctB = removeDuplicate(b);
        int[] distinctC = removeDuplicate(c);

        Arrays.sort(distinctA);
        Arrays.sort(distinctB);
        Arrays.sort(distinctC);
        int count = 0;

        for(int q : distinctB){

        /*    List<Integer> lessThanP = Arrays.stream(distinctA).boxed()
                    .filter(p -> p <=  distinctB[l]).collect(Collectors.toList());
            List<Integer> lessThanR = Arrays.stream(distinctC).boxed()
                    .filter(q -> q <=  distinctB[l]).collect(Collectors.toList());*/

            int aCount = getValidIndexCount(distinctA, q) + 1;
            int bCount = getValidIndexCount(distinctC, q) + 1;
            count += (aCount* bCount);
        }
        return count;
    }

    public static int getValidIndexCount(int[] q, int key) {
        int low = 0;
        int high = q.length -1;
        int count = -1;

        while (low <= high) {
            int mid = low + (high-low)/2;
            if (q[mid] <= key) {
              count = mid;
              low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return count;
    }

    public static int[] removeDuplicate(int[] ar) {
        Set<Integer> distinctArr = Arrays.stream(ar).boxed().collect(Collectors.toSet());
        int[] ra = distinctArr.stream().mapToInt(Integer::intValue).toArray();
        return ra;
    }
    public static void main(String ar[]) {

        System.out.println("call child::" + tripleCount(new int[]{1, 3, 5, 7}, new int[]{5, 7, 9}, new int[]{7, 9, 11, 13}));
    }
}
