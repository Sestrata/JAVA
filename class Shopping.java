import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = countVideoCards * 250.00;
        double priceProcessors = countProcessors * (priceVideoCards * 0.35);
        double priceRAM = countRAM * (priceVideoCards * 0.10);

        double totalSum = priceVideoCards + priceProcessors + priceRAM;

        if (countVideoCards > countProcessors){
            totalSum = totalSum * 0.85;
        }

        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
