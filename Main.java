import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n1. Add Expense\n2. View Total\n3. Category Report\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Category: ");
                String category = sc.nextLine();

                System.out.print("Date: ");
                String date = sc.nextLine();

                System.out.print("Description: ");
                String desc = sc.nextLine();

                manager.addExpense(new Expense(amount, category, date, desc));
            }
            else if (choice == 2) {
                System.out.println("Total Expense: " + manager.getTotalExpense());
            }
            else if (choice == 3) {
                System.out.println(manager.categoryWiseExpense());
            }
            else {
                break;
            }
        }
    }
}
