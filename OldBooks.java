import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String input = scanner.nextLine();
        int bookCount = 0;

        while (!input.equals("No More Books")) {
            if (bookName.equals(input)) {
                break;
            }
            ++bookCount;
            input = scanner.nextLine();
        }

        if (bookName.equals(input)) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
