import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                int sum = num1 + num2;
                System.out.printf("%d + %d = %d - %s%n", num1, num2, sum, (sum % 2 == 0) ? "even" : "odd");
                break;
            case '-':
                int difference = num1 - num2;
                System.out.printf("%d - %d = %d - %s%n", num1, num2, difference, (difference % 2 == 0) ? "even" : "odd");
                break;
            case '*':
                int product = num1 * num2;
                System.out.printf("%d * %d = %d - %s%n", num1, num2, product, (product % 2 == 0) ? "even" : "odd");
                break;
            case '/':
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    double division = (double) num1 / num2;
                    System.out.printf("%d / %d = %.2f%n", num1, num2, division);
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    int modulus = num1 % num2;
                    System.out.printf("%d %% %d = %d%n", num1, num2, modulus);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
