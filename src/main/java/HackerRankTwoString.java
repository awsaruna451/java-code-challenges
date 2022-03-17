public class HackerRankTwoString {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        String reS = "NO";
        for(char i='a';i<='z';i++) {
            String ch = String.valueOf(i);

            if (s1.indexOf(ch) != -1 && s2.indexOf(ch) != -1) {
                reS = "YES";
                break;
            }

        }
     return reS;
    }
    public static void main(String[] args) {
        System.out.println(twoStrings("hi", "world"));
    }
}
