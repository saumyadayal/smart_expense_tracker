import java.io.*;
import java.util.*;

public class FileHandler {

    public static void saveExpenses(List<Expense> expenses) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("expenses.txt"));

        for (Expense e : expenses) {
            writer.write(e.toString());
            writer.newLine();
        }

        writer.close();
    }

    public static List<Expense> loadExpenses() throws IOException {
        List<Expense> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("expenses.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            list.add(new Expense(
                Double.parseDouble(parts[2]),
                parts[1],
                parts[0],
                parts[3]
            ));
        }

        reader.close();
        return list;
    }
}
