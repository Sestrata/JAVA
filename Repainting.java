import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededThinner = Integer.parseInt(scanner.nextLine());
        int neededHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (neededNylon + 2) * 1.50;
        double paintPrice = (neededPaint + neededPaint * 0.10) * 14.50;
        double thinnerPrice = neededThinner * 5.00;

        double totalSumForMaterials = nylonPrice + paintPrice + thinnerPrice + 0.40;

        double buildersPrice = (totalSumForMaterials * 0.30) * neededHours;

        double totalSum = totalSumForMaterials + buildersPrice;

        System.out.println(totalSum);
    }
}
