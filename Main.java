import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n==============================");
            System.out.println("  EXPENSE TRACKER MENU   ");
            System.out.println("==============================");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total");
            System.out.println("3. Category Report");
            System.out.println("4. Smart Summary");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

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
                System.out.println(" Expense added successfully!");

            } 
            else if (choice == 2) {
                System.out.println(" Total Expense: ₹" + manager.getTotalExpense());
            } 
            else if (choice == 3) {
                System.out.println(" Category Report:");
                System.out.println(manager.categoryWiseExpense());
            } 
            else if (choice == 4) {
               
                ReportGenerator.generateSummary(manager.getExpenses());
            } 
            else if (choice == 5) {
                System.out.println(" Exiting... Thank you!");
                break;
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
