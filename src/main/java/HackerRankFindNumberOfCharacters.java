import java.util.Scanner;

public class HackerRankFindNumberOfCharacters {

    public static Long getNumberOfCharacters(String initialString, Long defineLength) {
        int initialLength = initialString.length();
        long q = defineLength/initialLength;
        long r = defineLength % initialLength;
        long remainLength = (r == 0) ? 0 : r;
        return q * (numberOfCharacterInString(initialString, initialLength)) + numberOfCharacterInString(initialString, remainLength);
    }

    public static Long numberOfCharacterInString (String s, long length) {
        long count = 0;
        for (int n = 0 ; n < length; n++) {
            if (s.charAt(n) == 'a') {
                count ++;
            }
        }
        return count;
    }
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Repeated String::");
        String x = scanner.next();
        System.out.println("Enter String repeated length::");
        Long a = scanner.nextLong();
        System.out.println("Password is valid::" + getNumberOfCharacters(x, a));
    }
}
