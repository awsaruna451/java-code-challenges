import java.util.List;

public class HackerRankArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long[] inputArray = new long[n + 2];
        for (int i =0; i < queries.size(); i++) {
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            int k = queries.get(i).get(2);
            inputArray[a] += k;
            inputArray[b+1] -= k;
        }
      long max = getMax(inputArray);
        return max;
    }

    private static long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int j = 0; j < inputArray.length; j++) {
            sum += inputArray[j];
            max = Math.max(max, sum);
        }
        return  max;
    }

}
