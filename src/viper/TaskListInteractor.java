package viper;

import java.util.List;

// Класс TaskListInteractor отвечает за бизнес-логику и получение данных
public class TaskListInteractor {
    private TaskRepository repository;

    public TaskListInteractor(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getTasks() {
        return repository.getTasks();
    }
}
