import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int winners = 0;
        int points = 0;

        for (int tournament = 1; tournament <= tournaments; tournament++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    winners++;
                    points += 2000;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", points + startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((double) points / tournaments));
        System.out.printf("%.2f%%", (double) winners / tournaments * 100);
    }
}
