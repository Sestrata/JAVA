import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 1 || n > 600000) {
            System.out.println("Невалидно число N. Моля, въведете число в интервала [1…600000].");
            return;
        }

        for (int number = 1111; number <= 9999; number++) {
            int digit;
            int tempNumber = number;
            boolean isSpecial = true;

            while (tempNumber > 0) {
                digit = tempNumber % 10;

                if (digit == 0 || n % digit != 0) {
                    isSpecial = false;
                    break;
                }

                tempNumber /= 10;
            }

            if (isSpecial) {
                System.out.print(number + " ");
            }
        }
    }
}
