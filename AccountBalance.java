import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmount = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("NoMoreMoney")) {
                break;
            }

            double amount;
            try {
                amount = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid operation!");
                break; // Променено от return на break
            }

            if (amount < 0) {
                System.out.println("Invalid operation!");
                break; // Променено от return на break
            }

            totalAmount += amount;
            System.out.printf("Increase: %.2f%n", amount);
        }

        System.out.printf("Total: %.2f%n", totalAmount);
    }
}

//public class AccountBalance {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double totalAmount = 0;
//
//        while (true) {
//            String input = scanner.nextLine();
//
//            if (input.equals("NoMoreMoney")) {
//                break;
//            }
//
//            if (isValidDouble(input)) {
//                double amount = Double.parseDouble(input);
//
//                if (amount >= 0) {
//                    totalAmount += amount;
//                    System.out.printf("Increase: %.2f%n", amount);
//                } else {
//                    System.out.println("Invalid operation!");
//                    break;
//                }
//            } else {
//                System.out.println("Invalid operation!");
//                break;
//            }
//        }
//
//        System.out.printf("Total: %.2f%n", totalAmount);
//    }
//
//    private static boolean isValidDouble(String input) {
//        return Pattern.matches("^[-+]?[0-9]*\\.?[0-9]+$", input);
//    }
//}
