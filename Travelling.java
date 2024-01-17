import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double needMoney = Double.parseDouble(scanner.nextLine());
            double saveMoney = 0;

            while (saveMoney < needMoney) {
                double sum = Double.parseDouble(scanner.nextLine());
                saveMoney += sum;
            }

            System.out.println("Going to " + destination + "!");

            destination = scanner.nextLine();
        }
    }
}
