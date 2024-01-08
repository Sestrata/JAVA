import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPenPackage = Integer.parseInt(scanner.nextLine());
        int countHighlightersPackage = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = countPenPackage * 5.80;
        double highlightersPrice = countHighlightersPackage * 7.20;
        double cleaningAgentPrice = cleaningAgent * 1.20;

        double sumWithoutDiscount = pensPrice + highlightersPrice + cleaningAgentPrice;

        double finalSum = sumWithoutDiscount - (sumWithoutDiscount * discount / 100);

        System.out.println(finalSum);
    }
}
