package viper;

import java.util.List;

// Интерфейс View, который определяет методы для отображения задач
public interface TaskListView {
    void showTasks(List<Task> tasks);

    void showTaskDetails(Task task);
}
