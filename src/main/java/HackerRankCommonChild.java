import java.util.*;

public class HackerRankCommonChild {
    public static int commonChild(String s1, String s2) {
        // Write your code here

        List<String> list = new ArrayList<>();
        for (int k = 0; k < s2.length();k++) {
            list.add(s2.substring(k, k+1));
        }

        TreeMap<Integer, String> commonChildString = new TreeMap<Integer,String>();
        StringBuilder sb = new StringBuilder();
        for (int a=0; a< s1.length(); a++) {
            String s = s1.substring(a, a+1);
            int index = list.indexOf(s);

            if (index != -1 && commonChildString.get(index) == null && index > a ) {
                sb.append(s);
                commonChildString.put(index, s);
                list.remove(index);
            }
        }

     return sb.length();
    }

    public static void main(String[] args) {
        System.out.println("child::Length ::" + commonChild("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));
    }

}
