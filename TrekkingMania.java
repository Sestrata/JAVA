import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups = Integer.parseInt(scanner.nextLine());
        int allClimbers = 0;
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;

        for (int currentCountPeople = 1; currentCountPeople <= countGroups; currentCountPeople++) {
            int currentCount = Integer.parseInt(scanner.nextLine());
            allClimbers += currentCount;

            if (currentCount <= 5) {
                group1 += currentCount;
            } else if (currentCount >= 6 && currentCount <= 12) {
                group2 += currentCount;
            } else if (currentCount >= 13 && currentCount <= 25) {
                group3 += currentCount;
            } else if (currentCount >= 26 && currentCount <= 40) {
                group4 += currentCount;
            } else if (currentCount >= 40) {
                group5 += currentCount;
            }
        }
        double percentGroup1 = (double) group1 / allClimbers * 100;
        double percentGroup2 = (double) group2 / allClimbers * 100;
        double percentGroup3 = (double) group3 / allClimbers * 100;
        double percentGroup4 = (double) group4 / allClimbers * 100;
        double percentGroup5 = (double) group5 / allClimbers * 100;

        System.out.printf("%.2f%%%n", percentGroup1);
        System.out.printf("%.2f%%%n", percentGroup2);
        System.out.printf("%.2f%%%n", percentGroup3);
        System.out.printf("%.2f%%%n", percentGroup4);
        System.out.printf("%.2f%%%n", percentGroup5);
    }
}
