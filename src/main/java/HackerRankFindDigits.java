public class HackerRankFindDigits {
<<<<<<< HEAD

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
=======
>>>>>>> f430aa0608260e2a3886ce2dd0d4b938c0b46ed1
}
