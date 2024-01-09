import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startScores = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (startScores <= 100){
            bonus = 5;
        } else if(startScores > 1000){
            bonus = startScores * 0.10;
        } else {
            bonus = startScores * 0.20;
        }

        if (startScores % 2 == 0) {
            bonus += 1;
        } else if (startScores % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(startScores + bonus);
    }
}
