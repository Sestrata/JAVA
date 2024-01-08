import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPackFoodForDogs = Integer.parseInt(scanner.nextLine());
        int countPackFoodForCats = Integer.parseInt(scanner.nextLine());

        double resultForDogs = countPackFoodForDogs * 2.50;
        double resultForCats = countPackFoodForCats * 4;

        double result = resultForDogs + resultForCats;

        System.out.printf(result + " lv.");
    }
}
