import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HackerRankSubSequentArrayCheck {

    public static int maxSubsequenceLength(int k, List<Integer> arr) {
        Collections.sort(arr);
        int count = 0;
        for(int i =0; i< arr.size(); i++) {
            if ( (arr.get(arr.size() -1-i) - arr.get(i)) < k) {
                count++;
                break;
            } else if ( (arr.get(arr.size() -1-i) - arr.get(i)) == k) {
                count++;
            }
        }
        return count;
    }
    public static void main(String ar[]) {
        List list = Arrays.asList(1, 2, 2, 1, 6);
        int k = 5;

        System.out.println("call child::" + maxSubsequenceLength(k, list));
    }
}
