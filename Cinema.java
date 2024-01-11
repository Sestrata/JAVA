import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int countRows = Integer.parseInt(scanner.nextLine());
        int countColumns = Integer.parseInt(scanner.nextLine());
        double result = 0.0;

        if ("Premiere".equals(projection)){
            result = (countRows * countColumns) * 12.00;
        } else if ("Normal".equals(projection)) {
            result = (countRows * countColumns) * 7.50;
        } else if ("Discount".equals(projection)) {
            result = (countRows * countColumns) * 5.00;
        }
           System.out.printf("%.2f leva", result);
    }
}
