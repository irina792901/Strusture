package MVP2;

import java.util.List;

// Представление (View)
public class View {
    public void displayTasks(List<String> tasks) {
        System.out.println("Список задач:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
