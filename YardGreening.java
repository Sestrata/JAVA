import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allSqm = Double.parseDouble(scanner.nextLine());
        double amount = allSqm * 7.61;
        double discount = amount * 0.18;

        double finalPrice = amount - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv", discount);
    }
}
