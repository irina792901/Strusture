package MVP;

import java.util.List;
import java.util.Scanner;

// Реализация Представления (View)
public class ConsoleTaskView implements TaskView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayTasks(List<String> tasks) {
        System.out.println("Список задач:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }

    @Override
    public String getUserInput() {
        System.out.print("Введите новую задачу: ");
        return scanner.nextLine();
    }
}
