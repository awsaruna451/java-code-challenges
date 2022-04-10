public class HackerRankRepeatedString {

    public static long repeatedString(String s, long n) {
        // Write your code here
        int strLength =  s.length();
        long divisor = n/strLength;
        long remain = (n - divisor * strLength);
        long charCount = 0;
        for (int x =0; x < strLength; x++) {
            if (s.charAt(x) == 'a') {
                charCount++;
            }
        }
         charCount = divisor * charCount;

        if (remain == 0) {
            return charCount;
        } else {
           long remainCharCount = 0;
           for (int x =0; x < remain; x++) {
               if (s.charAt(x) == 'a') {
                   remainCharCount++;
               }
           }
           System.out.println(remainCharCount);

           return remainCharCount + charCount;

        }



    }

    public static void main(String...ar) {
        System.out.println(repeatedString("a", 1000000000000l));
    }
}
