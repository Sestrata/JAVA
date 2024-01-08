import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int feePerYear = Integer.parseInt(scanner.nextLine());

        double trainersPrice = feePerYear * 0.60;
        double suitPrice = trainersPrice * 0.80;
        double ballPrice = suitPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double finalPrice = feePerYear + trainersPrice + suitPrice +ballPrice + accessoriesPrice;

        System.out.print(finalPrice);
    }
}
