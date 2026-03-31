import java.util.*;

public class ReportGenerator {

    public static void generateSummary(List<Expense> expenses) {
        double total = 0;

        for (Expense e : expenses) {
            total += e.getAmount();
        }

        System.out.println("\n===== EXPENSE SUMMARY =====");
        System.out.println("Total Spending: ₹" + total);

        Map<String, Double> categoryMap = new HashMap<>();

        for (Expense e : expenses) {
            categoryMap.put(
                e.getCategory(),
                categoryMap.getOrDefault(e.getCategory(), 0.0) + e.getAmount()
            );
        }

        System.out.println("\nCategory-wise Spending:");
        for (String category : categoryMap.keySet()) {
            double amount = categoryMap.get(category);
            double percent = (amount / total) * 100;

            System.out.println(category + ": ₹" + amount + " (" + String.format("%.2f", percent) + "%)");
        }

        generateInsights(categoryMap, total);
    }

    // 🔥 Smart Insights
    private static void generateInsights(Map<String, Double> categoryMap, double total) {
        System.out.println("\n===== SMART INSIGHTS =====");

        String maxCategory = "";
        double maxAmount = 0;

        for (String category : categoryMap.keySet()) {
            if (categoryMap.get(category) > maxAmount) {
                maxAmount = categoryMap.get(category);
                maxCategory = category;
            }
        }

        System.out.println("💡 Highest spending category: " + maxCategory);

        if (maxAmount > total * 0.5) {
            System.out.println("⚠️ Warning: You are spending more than 50% on " + maxCategory);
            System.out.println("👉 Suggestion: Try reducing expenses in this category.");
        } else {
            System.out.println("✅ Good job! Your spending is balanced.");
        }
    }
}
