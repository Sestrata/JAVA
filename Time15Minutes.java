import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 15;

        if (minutes >= 60) {
            minutes = minutes - 60;
            hour += 1;
        }

        if (hour >= 24) {
            hour -= 24;
        }
       System.out.printf("%d:%02d", hour, minutes);
    }
}
