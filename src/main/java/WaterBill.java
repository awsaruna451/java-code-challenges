import java.util.Scanner;

public class WaterBill {

    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Used Gallon::");
        Double x = scanner.nextDouble();
        System.out.println("Total Billing cost::" + calculateWaterBill(x));
    }


    public static Double calculateWaterBill(Double totalGallon) {
        double minimumCharge = 18.84;
        double marginGallons = 1496;

        if (totalGallon <= marginGallons) {
            return minimumCharge;
        }
        Double extraGallons = totalGallon - marginGallons;
        System.out.println(extraGallons);
        Double extraAmount = Math.ceil(extraGallons/748) *3.90;

        return minimumCharge + extraAmount;
    }

}
