import java.util.Scanner;

public class HackerRankStringChild {

    public static int childChoise(String first, String second){
        char[] firstC = first.toCharArray();
        char[] secondC = second.toCharArray();
        int n = first.length();
        int m = second.length();
        int[] memo = new int[m+1];

        for (int i = 1; i <= n; i++) {
            int prev = 0;
            for (int j = 1; j <= m; j++) {
                int temp = memo[j];
                if (firstC[i -1] == secondC[j-1]) {
                    memo[j] = prev + 1;

                } else {
                    memo[j] = Math.max(memo[j], memo[j-1]);
                }
                prev = temp;
            }
        }
        return memo[m];
    }

    public static void main(String ar[]) {
   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Repeated String::");
        String x = scanner.next();*/

        System.out.println("call child::" + childChoise("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));
    }
}
