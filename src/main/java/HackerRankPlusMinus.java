import java.util.List;

public class HackerRankPlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int postive = 0, negative = 0,zeros = 0;
       for(int k = 0; k < arr.size(); k++) {
           if (arr.get(k) > 0) {
               postive++;
           } else if(arr.get(k)< 0) {
               negative ++;
           } else {
               zeros++;
           }
       }
       double scale = Math.pow(10, 6);
       System.out.println(Math.round(scale * postive/n) / scale);
       System.out.println(Math.round(scale * negative/n) / scale);
       System.out.println(Math.round(scale * zeros/n) / scale);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(-4,3,-9,0,4,1);
        plusMinus(list);
    }


}
