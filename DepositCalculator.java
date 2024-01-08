import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double profitPerMonth = (depositSum * (interestRate / 100)) / 12;
        double totalSum = depositSum + profitPerMonth * months;

        System.out.println(totalSum);
    }
}
