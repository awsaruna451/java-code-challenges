import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HackerRankStringConstruction {

    public static int stringConstruction(String s) {
        // Write your code here
        int dollarCount = 0;
        Set<Character> ls = new HashSet<>();
        for (int k = 0; k < s.length(); k++) {
            ls.add(s.charAt(k));
        }

      return ls.size();
    }


    public static void main(String[] args) {
        System.out.println("$Count::"+stringConstruction("bccb"));
    }


}
