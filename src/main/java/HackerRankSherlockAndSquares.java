public class HackerRankSherlockAndSquares {

    public static int squares(int a, int b) {
        int squareCount = 0;
        int min = (int)Math.abs(Math.sqrt(a));
        int max = (int)Math.floor(Math.sqrt(b));
        for (int x = min ; x <= max ; x++) {
            if (Math.pow(x, 2) < a) {
                continue;
            }
            if (Math.pow(x, 2) > b) {
                break;
            }

           squareCount++;
        }
        // Write your code here
        return squareCount;
    }

    public static void main(String[] args) {

        System.out.println("Hello World::"+ squares(3, 9));

    }
}
