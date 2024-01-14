import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judgesNum = Integer.parseInt(scanner.nextLine());
        double pointsFormNomination = 1250.5;

        for (int currentJudge = 1; currentJudge <= judgesNum; currentJudge++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            judgePoints = (judgeName.length() * judgePoints) / 2;
            points += judgePoints;

            if (points >= pointsFormNomination) {
                break;
            }
        }

        if (points >= pointsFormNomination) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, pointsFormNomination - points);
        }
    }
}
