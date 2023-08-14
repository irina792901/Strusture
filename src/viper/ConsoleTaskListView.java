package viper;

import java.util.List;

// Класс ConsoleTaskListView реализует интерфейс TaskListView для консольного вывода
public class ConsoleTaskListView implements TaskListView {
    @Override
    public void showTasks(List<Task> tasks) {
        System.out.println("Список задач:");
        for (Task task : tasks) {
            System.out.println(task.getTitle());
        }
    }
    @Override
    public void showTaskDetails(Task task) {
        System.out.println("Детали задачи:");
        System.out.println("Заголовок: " + task.getTitle());
        System.out.println("Статус: " + (task.isCompleted() ? "Выполнено" : "Не выполнено"));
    }
}