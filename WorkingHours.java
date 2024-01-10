import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        boolean isOpen = false;

        for (String weekday : weekdays) {
            if (weekday.equals(day) && hour >= 10 && hour <= 18) {
                isOpen = true;
                break;
            }
        }

        if (isOpen) {
            System.out.println("open");
        } else if ("Sunday".equals(day)) {
            System.out.println("closed");
        } else {
            System.out.println("closed");
        }
    }
}

//public class WorkingHours {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int hour = Integer.parseInt(scanner.nextLine());
//        String day = scanner.nextLine();
//
//        if ("Monday".equals(day)){
//            if (hour >= 10 && hour <= 18) {
//                System.out.println("open");
//            } else {
//                System.out.println("closed");
//            }
//        } else if ("Tuesday".equals(day)){
//            if (hour >= 10 && hour <= 18) {
//                System.out.println("open");
//            } else {
//                System.out.println("closed");
//            }
//        } else if ("Wednesday".equals(day)){
//            if (hour >= 10 && hour <= 18) {
//                System.out.println("open");
//            } else {
//                System.out.println("closed");
//            }
//        } else if ("Thursday".equals(day)){
//            if (hour >= 10 && hour <= 18) {
//                System.out.println("open");
//            } else {
//                System.out.println("closed");
//            }
//        } else if ("Friday".equals(day)){
//            if (hour >= 10 && hour <= 18) {
//                System.out.println("open");
//            } else {
//                System.out.println("closed");
//            }
//        } else if ("Saturday".equals(day)){
//            if (hour >= 10 && hour <= 18) {
//                System.out.println("open");
//            } else {
//                System.out.println("closed");
//            }
//        } else if("Sunday".equals(day)){
//            System.out.println("closed");
//        }
//    }
//}
