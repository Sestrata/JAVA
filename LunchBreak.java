import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double restOfBreak = durationBreak - ((durationBreak / 8.0) + (durationBreak / 4.0));
        double diff = Math.ceil(Math.abs(restOfBreak - durationEpisode));

        if (restOfBreak >= durationEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, diff);
        }
    }
}
