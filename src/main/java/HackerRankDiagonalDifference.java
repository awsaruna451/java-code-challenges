import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankDiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumLeft += arr.get(i).get(i);
            sumRight += arr.get(i).get(arr.size()-1-i);
        }
      return Math.abs(sumLeft-sumRight);
    }
    public static void main(String ar[]) {
        List<Integer> arr1 = Arrays.asList(11, 2, 4);
        List<Integer> arr2 = Arrays.asList(4, 5, 6);
        List<Integer> arr3 = Arrays.asList(10, 8, -12);
        List totalArray = new ArrayList();
        totalArray.add(arr1);
        totalArray.add(arr2);
        totalArray.add(arr3);

        System.out.println("call child::" + diagonalDifference(totalArray));
    }
}
