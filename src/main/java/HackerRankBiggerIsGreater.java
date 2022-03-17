public class HackerRankBiggerIsGreater {

    public static String biggerIsGreater(String w) {
        // Write your code here
        for (int i = w.length()-1; i >= 1; i--) {
            String newString = w.substring(0, i-1) + w.charAt(i) + w.substring(i-1, i);
            if (newString.compareTo(w) > 0) {
                return  newString;
            }
        }
      return "no answer";
    }

    public static void main(String...ar) {
        System.out.println(biggerIsGreater("dkhc"));
    }
}
