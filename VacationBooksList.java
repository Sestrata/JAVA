import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        int timeForBook = countPages / pagesForHour;
        int hoursForDay = timeForBook / countDays;

        System.out.println(hoursForDay);
    }
}
