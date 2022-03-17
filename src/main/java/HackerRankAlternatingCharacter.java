public class HackerRankAlternatingCharacter {
    public static int alternatingCharacters(String s) {
        // Write your code here
        char ar[] = s.toCharArray();
        String alternating = "";
        int removeCharacterCount = 0;
        for (int i =0; i < ar.length; i++) {
            if (alternating.length() <= 0) {
                if ("A".equals(String.valueOf(ar[i])) || "B".equals(String.valueOf(ar[i]))) {
                    alternating = String.valueOf(ar[i]);
                } else {
                    removeCharacterCount++;
                }
            } else {
                alternating += String.valueOf(ar[i]);
                String lastString = alternating.substring(alternating.length() -2, alternating.length());
                if ("AB".equals(lastString) || "BA".equals(lastString) ) {
                    continue;
                } else {
                    alternating = alternating.substring(0, alternating.length()-1);
                    removeCharacterCount++;
                }
            }
        }
     return removeCharacterCount;
    }
    public static int alternatingCharacters2(String s) {

        int removeCharacterCount = 0;
        for (int i =1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                removeCharacterCount++;
            }
        }
        return removeCharacterCount;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters2("AAABBB"));
    }
}
