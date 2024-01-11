import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());
        double totalApartment = 0.0;
        double totalStudio = 0.0;

        if ("May".equals(month) || "October".equals(month)){
            totalStudio = countNights * 50.00;
            totalApartment = countNights * 65.00;

            if (countNights > 7 && countNights <= 14){
                totalStudio = (countNights * 50.00) * 0.95;
            } else if (countNights > 14){
                totalStudio = (countNights * 50.00) * 0.70;
                totalApartment = (countNights * 65.00) * 0.90;
            }
        } else if ("June".equals(month) || "September".equals(month)){
            totalStudio = countNights * 75.20;
            totalApartment = countNights * 68.70;
            if (countNights > 14){
                totalStudio = (countNights * 75.20) * 0.80;
                totalApartment = (countNights * 68.70) * 0.90;
            }
        } else if ("July".equals(month) || "August".equals(month)){
            totalStudio = countNights * 76.00;
            totalApartment = countNights * 77.00;
            if (countNights > 14){
               totalApartment = (countNights * 77.00) * 0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", totalApartment);
        System.out.printf("Studio: %.2f lv.", totalStudio);
    }
}
