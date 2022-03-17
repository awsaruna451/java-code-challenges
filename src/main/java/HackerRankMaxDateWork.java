import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankMaxDateWork {

    public static int maxStreak(int m, List<String> data) {
        int count = 0;
        for(String attendance : data) {
            if (attendance.length() == m && !attendance.contains("N")) {
                count ++;
            }
        }
       return count;
    }
    public static int maxStreak1(int m, List<String> data) {
       List<String> da = data.stream().filter(s -> !s.contains("N") && s.length()==m).collect(Collectors.toList());
       return da.size();
    }

    public static void main(String ar[]) {
        List list = Arrays.asList("NYY");
        int m = 3;

        System.out.println("call child::" + maxStreak1(3, list));
    }
}
