import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number::");
        int x = scanner.nextInt();
        System.out.println("Number is even::" + checkEven(x));
    }

    public static boolean checkEven(int number) {
        return number%2 == 0;
    }
}
