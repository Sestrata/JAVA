import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int standard = 0;
        int student = 0;
        int kid = 0;

        while (!"Finish".equals(input)) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());
            int seatSold = 0;

            String ticketsType = scanner.nextLine();

            while (!"End".equals(ticketsType)) {
                seatSold++;

                switch (ticketsType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }

                if (seats == seatSold) {
                    break;
                }

                ticketsType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, (double) seatSold / seats * 100);

            input = scanner.nextLine();
        }

        int totalTickets = standard + student + kid;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (double) student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double) standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", (double) kid / totalTickets * 100);
    }
}
