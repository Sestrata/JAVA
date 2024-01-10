import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double result = 0;

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day)){
            if ("banana".equals(fruit)){
                result = count * 2.50;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("apple".equals(fruit)){
                result = count * 1.20;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("orange".equals(fruit)){
                result = count * 0.85;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("grapefruit".equals(fruit)){
                result = count * 1.45;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ( "kiwi".equals(fruit)){
                result = count * 2.70;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("pineapple".equals(fruit)){
                result = count * 5.50;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("grapes".equals(fruit)){
                result = count * 3.85;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else {
                System.out.println("error");
            }
        } else if ( "Saturday".equals(day) || "Sunday".equals(day)){
            if ("banana".equals(fruit)){
                result = count * 2.70;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("apple".equals(fruit)){
                result = count * 1.25;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("orange".equals(fruit)){
                result = count * 0.90;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("grapefruit".equals(fruit)){
                result = count * 1.60;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ( "kiwi".equals(fruit)){
                result = count * 3.00;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("pineapple".equals(fruit)){
                result = count * 5.60;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            } else if ("grapes".equals(fruit)){
                result = count * 4.20;
                String formattedResult = String.format("%.2f", result);
                System.out.println(formattedResult);
            }   else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
