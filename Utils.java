import java.util.Scanner;

public class Utils {

    private static Scanner sc = new Scanner(System.in);

    public static int getIntInput(String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.println("❌ Invalid input! Enter a number.");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double getDoubleInput(String message) {
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            System.out.println("❌ Invalid input! Enter a valid amount.");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static String getStringInput(String message) {
        System.out.print(message);
        sc.nextLine(); // clear buffer
        return sc.nextLine();
    }

    public static void printMenu() {
        System.out.println("\n==============================");
        System.out.println("   💸 EXPENSE TRACKER MENU   ");
        System.out.println("==============================");
        System.out.println("1. Add Expense");
        System.out.println("2. View Total");
        System.out.println("3. Category Report");
        System.out.println("4. Smart Summary");
        System.out.println("5. Exit");
        System.out.println("==============================");
    }
}
