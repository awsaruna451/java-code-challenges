import java.util.*;

public class HackerRankMakingAnagrams {

    public static int makingAnagrams(String s1, String s2) {
        // Write your code hereL

        //Map<Integer, String> sb = new HashMap<>();
        List<String> sb = new ArrayList<>();
        for (int x = 0; x < s2.length(); x++) {
            sb.add(String.valueOf(s2.charAt(x)));
        }
        int removeCount = 0;
        for (int x = 0; x < s1.length(); x++) {
            String p = String.valueOf(s1.charAt(x));
            int index = sb.indexOf(p);
            if (index != -1) {
                sb.remove(p);
            } else {
                removeCount++;
            }
        }

        removeCount +=  sb.size();

        return removeCount;

    }

    public static void main(String[] args) {
        System.out.println("Remove Count::"+ makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
    }

}
