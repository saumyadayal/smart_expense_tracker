import java.util.*;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public Map<String, Double> categoryWiseExpense() {
        Map<String, Double> map = new HashMap<>();

        for (Expense e : expenses) {
            map.put(e.getCategory(),
                map.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
        }

        return map;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
