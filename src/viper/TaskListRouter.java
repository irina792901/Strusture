package viper;

import javax.naming.Context;

// Класс TaskListRouter отвечает за навигацию между модулями
public class TaskListRouter {
    private Context context;

    public TaskListRouter(Context context) {
        this.context = context;
    }

    public void navigateToTaskDetails(Task task) {
        // Реализация навигации к деталям задачи
        System.out.println("Навигация к деталям задачи: " + task.getTitle());
    }
}
