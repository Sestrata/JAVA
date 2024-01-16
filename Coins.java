import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rest = scanner.nextDouble();

        int restInCents = (int) (rest * 100);

        int twoLeva = restInCents / 200;
        restInCents %= 200;

        int oneLev = restInCents / 100;
        restInCents %= 100;

        int fiftyStotinki = restInCents / 50;
        restInCents %= 50;

        int twentyStotinki = restInCents / 20;
        restInCents %= 20;

        int tenStotinki = restInCents / 10;
        restInCents %= 10;

        int fiveStotinki = restInCents / 5;
        restInCents %= 5;

        int twoStotinki = restInCents / 2;
        restInCents %= 2;

        int oneStotinka = restInCents;

        int totalCoins = twoLeva + oneLev + fiftyStotinki + twentyStotinki + tenStotinki + fiveStotinki + twoStotinki + oneStotinka;

        System.out.println(totalCoins);
    }
}
