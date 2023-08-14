package viper;

import java.util.List;

// Интерфейс TaskRepository определяет метод для получения задач
public interface TaskRepository {
    List<Task> getTasks();
}
