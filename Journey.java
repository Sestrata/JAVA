import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double total = 0.0;
        String destination = "";
        String campOrHotel = "";

        if (budget <= 100){
            destination = "Bulgaria";
            if ("summer".equals(season)){
                total = budget * 0.30;
                campOrHotel = "Camp";
            } else if ("winter".equals(season)) {
                total = budget * 0.70;
                campOrHotel = "Hotel";
            }
        } else if (budget <= 1000){
            destination = "Balkans";
            if ("summer".equals(season)){
                total = budget * 0.40;
                campOrHotel = "Camp";
            } else if ("winter".equals(season)){
                total = budget * 0.80;
                campOrHotel = "Hotel";
            }
        } else if (budget > 1000){
            destination = "Europe";
            total = budget * 0.90;
            campOrHotel = "Hotel";
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", campOrHotel, total);
    }
}
