public class HackerRankSeparateNumber {

    public static void separateNumbers(String s) {
        // Write your code here
        String validString = "", subString ="";
        boolean isValid = false;
        for (int i =1; i <= s.length()/2; i++) {
            subString = s.substring(0, i);
          validString = subString;
          Long validNum = Long.parseLong(validString);
          while (validString.length()< s.length()) {
              validString += Long.toString(++validNum);
          }
          if (validString.equals(s)) {
              isValid = true;
              break;
          }
        }
        System.out.println(isValid? "YES " + subString : "NO");
    }

    public static void main(String... ar) {
        separateNumbers("99100");
    }
}
