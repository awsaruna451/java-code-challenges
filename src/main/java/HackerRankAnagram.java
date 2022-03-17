import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankAnagram {

    public static int anagram(String s) {
        // Write your code here
        int length =  s.length();
        String s1 = s.substring(0, length/2);
        String s2 = s.substring(length/2, length);
        if (s1.length() != s2.length()) {
            return -1;
        }
        List<String> sb = new ArrayList<>();
        for (int x = 0; x < s2.length(); x++) {
            sb.add(String.valueOf(s2.charAt(x)));
        }

        int replaceCount = 0;
        for (int i = 0; i < s1.length(); i++) {
             String p = s1.substring(i, i+1);
             int index = sb.indexOf(p);
             if (index == -1) {
                 replaceCount++;
             } else {
                 sb.remove(p);
             }
        }

        // System.out.println("s1::"+s1+ "s2::"+s2);
        return replaceCount;

    }

    public static void main(String[] args) {
       System.out.println(anagram("xaxbbbxx"));
    }
}
