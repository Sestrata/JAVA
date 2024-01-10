import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        double result;

        if ("Sofia".equals(town)){
            if (salesVolume >= 0 && salesVolume <= 500) {
                result = salesVolume * 0.05;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                result = salesVolume * 0.07;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                result = salesVolume * 0.08;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 10000){
                result = salesVolume * 0.12;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else {
                System.out.println("error");
            }
        } else if ("Varna".equals(town)){
            if (salesVolume >= 0 && salesVolume <= 500) {
                result = salesVolume * 0.045;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                result = salesVolume * 0.075;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                result = salesVolume * 0.1;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 10000){
                result = salesVolume * 0.13;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            }  else {
                System.out.println("error");
            }
        } else if ("Plovdiv".equals(town)){
            if (salesVolume >= 0 && salesVolume <= 500) {
                result = salesVolume * 0.055;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 500 && salesVolume <= 1000) {
                result = salesVolume * 0.08;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                result = salesVolume * 0.12;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else if (salesVolume > 10000){
                result = salesVolume * 0.145;
                String comission = String.format("%.2f", result);
                System.out.println(comission);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
