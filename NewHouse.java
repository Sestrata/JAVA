import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        if ("Roses".equals(flowerType)){
            if (countFlowers > 80){
                sum = (countFlowers * 5.00) * 0.90;
            } else {
                sum = countFlowers * 5.00;
            }
        } else if ("Dahlias".equals(flowerType)) {
            if (countFlowers > 90){
                sum = (countFlowers * 3.80) * 0.85;
            } else {
                sum = countFlowers * 3.80;
            }
        } else if ("Tulips".equals(flowerType)) {
            if (countFlowers > 80){
                sum = (countFlowers * 2.80) * 0.85;
            } else {
                sum = countFlowers * 2.80;
            }
        } else if ("Narcissus".equals(flowerType)) {
            if (countFlowers < 120){
                sum = (countFlowers * 3.00) * 1.15;
            } else {
                sum = countFlowers * 3.00;
            }
        } else if ("Gladiolus".equals(flowerType)) {
            if (countFlowers < 80){
                sum = (countFlowers * 2.50) * 1.20;
            } else {
                sum = countFlowers * 2.50;
            }
        }

        double total = Math.abs(budget - sum);

        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowerType, total);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", total);
        }
    }
}
