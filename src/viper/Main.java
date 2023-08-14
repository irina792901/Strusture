package viper;

import javax.naming.Context;

// Главный класс Main, где создаются экземпляры всех компонентов
public class Main {
    public static void main(String[] args) {
        TaskListView view = new ConsoleTaskListView();
        TaskRepository repository = new InMemoryTaskRepository();
        TaskListInteractor interactor = new TaskListInteractor(repository);
        Context context = null;
        TaskListRouter router = new TaskListRouter(context);

        TaskListPresenter presenter = new TaskListPresenter(view, interactor);
        presenter.loadTasks();

        Task selectedTask = new Task("Помыть посуду");// Пример выбора задачи
        Task selectedTask2 = new Task("Помыть посуду22");// Пример выбора задачи
        presenter.onTaskSelected(selectedTask);
        presenter.onTaskSelected(selectedTask2);
    }
}