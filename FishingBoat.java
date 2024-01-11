import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishermen = Integer.parseInt(scanner.nextLine());

        double rent = 0.0;

        if ("Spring".equals(season)){
            if (countFishermen <= 6){
                rent = 3000 * 0.90;
            } else if (countFishermen >= 7 && countFishermen <= 11){
                rent = 3000 * 0.85;
            } else if (countFishermen > 12) {
                rent = 3000 * 0.75;
            }

            if (countFishermen % 2 == 0 ){
                rent = rent * 0.95;
            }
        } else if ("Summer".equals(season)) {
            if (countFishermen <= 6){
                rent = 4200 * 0.90;
            } else if (countFishermen >= 7 && countFishermen <= 11){
                rent = 4200 * 0.85;
            } else if (countFishermen > 12) {
                rent = 4200 * 0.75;
            }

            if (countFishermen % 2 == 0 ){
                rent = rent * 0.95;
            }
        } else if ("Autumn".equals(season)) {
            if (countFishermen <= 6){
                rent = 4200 * 0.90;
            } else if (countFishermen >= 7 && countFishermen <= 11){
                rent = 4200 * 0.85;
            } else if (countFishermen > 12) {
                rent = 4200 * 0.75;
            }
        } else if ("Winter".equals(season)) {
            if (countFishermen <= 6){
                rent = 2600 * 0.90;
            } else if (countFishermen >= 7 && countFishermen <= 11){
                rent = 2600 * 0.85;
            } else if (countFishermen > 12) {
                rent = 2600 * 0.75;
            }

            if (countFishermen % 2 == 0 ){
                rent = rent * 0.95;
            }
        }

        double diff = Math.abs(budget - rent);
        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
