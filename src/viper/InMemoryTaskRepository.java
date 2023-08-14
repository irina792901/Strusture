package viper;

import java.util.ArrayList;
import java.util.List;

// Класс InMemoryTaskRepository реализует интерфейс TaskRepository и предоставляет список задач в памяти
public class InMemoryTaskRepository implements TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    public InMemoryTaskRepository() {
        tasks.add(new Task("Помыть посуду"));
        tasks.add(new Task("Постирать белье"));
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }
}