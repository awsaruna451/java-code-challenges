import java.util.Scanner;
import java.util.stream.IntStream;

public class HackerRankMakeStringAsPlandirom {

    public static int removedIndexOfStringMakeToPalindrom(String s) {
        int isPalindromeNotFound = -1;

        for (int x = 0; x < s.length()/2; x++) {
            if (s.charAt(x) != s.charAt(s.length()-x-1)) {

                if (x+1 < s.length()) {
                    boolean checkPalindrome = isPalindrome(s.substring(x+1, (s.length()-x)));
                    if (checkPalindrome)
                        return x;

                    return s.length()-x-1;
                }
            }
        }
        return isPalindromeNotFound;
    }

    public static boolean isPalindrome(String y) {

        return IntStream.range(0, y.length()/2)
                .allMatch(l -> y.charAt(l) == y.charAt(y.length()-l-1));
    }

    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Repeated String::");
        String x = scanner.next();

        System.out.println("Remove index to palindrome::" + removedIndexOfStringMakeToPalindrom(x));
    }
}
