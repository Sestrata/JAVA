import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        int difference = arrivalTime - examTime;

        if (difference < -30) {
            if (Math.abs(difference) < 60) {
                System.out.printf("Early\n%d minutes before the start", Math.abs(difference));
            } else {
                int hours = Math.abs(difference) / 60;
                int minutes = Math.abs(difference) % 60;
                System.out.printf("Early\n%d:%02d hours before the start", hours, minutes);
            }
        } else if (difference <= 0) {
            System.out.println("On time");
            if (difference != 0) {
                System.out.printf("%d minutes before the start", Math.abs(difference));
            }
        } else {
            if (Math.abs(difference) < 60) {
                System.out.printf("Late\n%d minutes after the start", Math.abs(difference));
            } else {
                int hours = Math.abs(difference) / 60;
                int minutes = Math.abs(difference) % 60;
                System.out.printf("Late\n%d:%02d hours after the start", hours, minutes);
            }
        }
    }
}
