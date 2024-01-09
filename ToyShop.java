import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTour = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double price =
                (countPuzzles * 2.60) +
                (countDolls * 3.00) +
                (countBears * 4.10) +
                (countMinions * 8.20) +
                (countTrucks * 2.00);
        int countAllToys = countPuzzles + countDolls + countBears + countMinions + countTrucks;

        double discount = 0.00;
        if (countAllToys >= 50 ){
            discount = price * 0.25;
        };

        double totalPrice = price - discount;
        double rent = totalPrice * 0.10;
        double profit = totalPrice - rent;

        double leftMoney;
        double neededMoney;
        if (profit >= priceTour) {
            leftMoney = profit - priceTour;
            System.out.printf("Yes! %.2f lv left.", leftMoney);
        } else if (profit < priceTour){
            neededMoney = priceTour - profit;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
    }
}
