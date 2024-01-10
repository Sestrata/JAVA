import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double cty = Double.parseDouble(scanner.nextLine());

        double result = 0;

        if ("Sofia".equals(town)){
            if ("coffee".equals(product)){
                result = cty * 0.50;
            } else if ("water".equals(product)){
                result = cty * 0.80;
            } else if ("beer".equals(product)){
                result = cty * 1.20;
            } else if ("sweets".equals(product)){
                result = cty * 1.45;
            } else if ("peanuts".equals(product)){
                result = cty * 1.60;
            }
        } else if ("Plovdiv".equals(town)){
            if ("coffee".equals(product)){
                result = cty * 0.40;
            } else if ("water".equals(product)){
                result = cty * 0.70;
            } else if ("beer".equals(product)){
                result = cty * 1.15;
            } else if ("sweets".equals(product)){
                result = cty * 1.30;
            } else if ("peanuts".equals(product)){
                result = cty * 1.50;
            }
        } else if ("Varna".equals(town)) {
            if ("coffee".equals(product)){
                result = cty * 0.45;
            } else if ("water".equals(product)){
                result = cty * 0.70;
            } else if ("beer".equals(product)){
                result = cty * 1.10;
            } else if ("sweets".equals(product)){
                result = cty * 1.35;
            } else if ("peanuts".equals(product)){
                result = cty * 1.55;
            }
        }
        System.out.println(result);
    }
}
