public class HackerRankLoveLetterMystery {

    public static int theLoveLetterMystery(String s) {
        // Write your code here

        int count = 0;
        for (int i = 0; i < s.length()/2; i++){
            int startIndex = s.charAt(i);
            int lastIndex = s.charAt(s.length()-i-1);
            if (startIndex == lastIndex) {
                continue;
            } else {
                int maxChar = lastIndex;
                int minChar = startIndex;
               if (startIndex > lastIndex) {
                   maxChar = startIndex;
                   minChar = lastIndex;
               }
               while (minChar < maxChar) {
                   maxChar--;
                   count++;
               }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abcba"));
    }
}
