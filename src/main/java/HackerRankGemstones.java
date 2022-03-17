import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HackerRankGemstones {
    public static int gemstones(List<String> arr) {
        // Write your code here
        int gemstoneCount = 0;
        String minStrLength = arr.stream().min(Comparator.comparing(i -> i.length())).get();

        for (int i = 0; i < minStrLength.length(); i++) {
            char val =  minStrLength.charAt(i);
            int l = 0;
            boolean gems = false;
            while(l < arr.size()) {
                if (arr.get(l) != null && arr.get(l).indexOf(val) != -1) {
                    gems = true;
                } else {
                    gems = false;
                    break;
                }
                l++;
            }
            if (gems) {
                gemstoneCount++;
            }
        }
      return gemstoneCount;
    }
    public static void main(String...ar) {
        List<String> listStr = List.of("abc","abc","bc");
        System.out.println(gemstones(listStr));
    }

}
