import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChickenMenu = Integer.parseInt(scanner.nextLine());
        int countFishMenu = Integer.parseInt(scanner.nextLine());
        int countVegMenu = Integer.parseInt(scanner.nextLine());

        double priceForChickenMenu = countChickenMenu * 10.35;
        double priceForFishMenu = countFishMenu * 12.40;
        double priceForVegMenu = countVegMenu * 8.15;

        double totalSumFormMenu = priceForChickenMenu + priceForFishMenu + priceForVegMenu;

        double dessert = totalSumFormMenu * 0.20;

        double totalSum = totalSumFormMenu + dessert + 2.50;

        System.out.println(totalSum);
    }
}
