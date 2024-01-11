import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double result = 0.0;

        if ("room for one person".equals(typeOfRoom)){
            result = (days-1) * 18.00;
        } else if ( "apartment".equals(typeOfRoom)){
            if (days < 10){
                result = ((days-1) * 25.00) * 0.70;
            } else if ( days > 10 && days < 15){
                result = ((days-1) * 25.00) * 0.65;
            } else if (days> 15){
                result = ((days-1) * 25.00) * 0.50;
            }
        } else if ("president apartment".equals(typeOfRoom)){
            if (days < 10){
                result = ((days-1) * 35.00) * 0.90;
            } else if ( days > 10 && days < 15){
                result = ((days-1) * 35.00) * 0.85;
            } else if (days> 15){
                result = ((days-1) * 35.00) * 0.80;
            }
        }

        if ("positive".equals(evaluation)){
            result = result + (result * 0.25);
        } else if ("negative".equals(evaluation)){
            result = result - (result * 0.10);
        }

        String formattedResult = String.format("%.2f", result);
        System.out.println(formattedResult);
    }
}
