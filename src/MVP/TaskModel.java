package MVP;

import java.util.ArrayList;
import java.util.List;

// Модель (Model)
public class TaskModel {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
