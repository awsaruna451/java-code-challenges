public class HackerRankFindDigits {

    public static int findDigits(int n) {
        
        String s = String.valueOf(n);
        int indexCount = 0;
        // Write your code here
        for (int x =0; x < s.length(); x++) {
            int p = Integer.parseInt(Character.toString(s.charAt(x)));
            if (p == 0) {
                continue;
            } else {
                int y = n%p;
                if (y == 0){
                    indexCount++;
                }
            }
        }
     return indexCount;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(124));
    }
}
