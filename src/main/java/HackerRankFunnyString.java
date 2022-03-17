public class HackerRankFunnyString {

    public static String funnyString(String s) {
        // Write your code here

        for (int i =1; i < s.length(); i++) {
            int original = Math.abs(s.charAt(i) - s.charAt(i-1));
            int reversAsci = Math.abs(s.charAt(s.length()-i) - s.charAt(s.length()-i-1));
            if (original != reversAsci) {
                return "Not Funny";
            }
        }

        return "Funny";
    }

    public static void main(String...ar) {
        System.out.println(funnyString("bcxz"));
    }

}
