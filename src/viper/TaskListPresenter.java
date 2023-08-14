package viper;

import java.util.List;

// Класс TaskListPresenter связывает View и Interactor, обрабатывает данные и события
public class TaskListPresenter {
    private TaskListView view;
    private TaskListInteractor interactor;

    public TaskListPresenter(TaskListView view, TaskListInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    public void loadTasks() {
        List<Task> tasks = interactor.getTasks();
        view.showTasks(tasks);
    }

    public void onTaskSelected(Task task) {
        view.showTaskDetails(task);
    }
}
