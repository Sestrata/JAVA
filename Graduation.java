import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        double totalGrade = 0.0;
        int classesFailed = 0;

        for (int i = 1; i <= 12; i++) {
            String input = scanner.nextLine();
            double grade = Double.parseDouble(input);

            if (grade < 4.00) {
                classesFailed++;

                if (classesFailed >= 2) {
                    System.out.printf("%s has been excluded at %d grade%n", studentName, i-1);
                    return;
                }
            }
            totalGrade += grade;
        }

        double averageGrade = totalGrade / 12;

        if (averageGrade >= 4.00) {
            System.out.printf("%s graduated. Average grade: %.2f%n", studentName, averageGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade%n", studentName, classesFailed + 1);
        }
    }
}
