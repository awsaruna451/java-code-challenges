import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HackerRankSherlockAndValidString {
    public static String isValid(String s) {
        // Write your code here
        String returnVal = "YES";
        if (s.length() < 2) {
            return "NO";
        }
        Map<String, Integer> stringMap = new HashMap<>();
        for (int x = 0; x < s.length(); x++) {
            char vl = s.charAt(x);
            if (stringMap.containsKey(String.valueOf(vl))) {
                stringMap.put(String.valueOf(vl), stringMap.get(String.valueOf(vl)) +1);
            } else {
                stringMap.put(String.valueOf(vl), 1);
            }
        }

         if (stringMap.size() > 1) {
             int count = stringMap.get(String.valueOf(s.charAt(0)));
             int distinctCount = 0;
             int disttinctValue = count;
             for (Integer countVal : stringMap.values()) {
                 if (count != countVal) {
                     distinctCount++;
                     disttinctValue = countVal;
                     if (distinctCount > 1) {
                         returnVal = "NO";
                         break;
                     }
                 }
             }

             if (Math.abs(disttinctValue - count) != 1) {
                 returnVal = "NO";
             }
         }
      return returnVal;
    }

    public static void main(String[] args) {
      //  System.out.println("values:::" + isValid("aabbccddeefghi"));
        System.out.println("values:::" + isValid("abcdefghhgfedecba"));
    }
}
