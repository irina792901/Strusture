package MVP2;

// Главный класс
public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new ConsoleTaskView();
        TaskPresenter presenter = new TaskPresenter(model, view);

        presenter.onAddTaskButtonClicked();
        presenter.onAddTaskButtonClicked();

        // Результат:
        // Список задач:
        // - Задача 1
        // - Задача 2
    }
}

