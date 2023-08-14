package MVP2;

import java.util.ArrayList;
import java.util.List;

/**
 * Пример с паттерном MVP:
 * java
 * Copy code
 * Модель (Model)
 */
public class TaskModel {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
