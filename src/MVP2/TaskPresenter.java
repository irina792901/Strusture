package MVP2;

import java.util.List;

// Презентер (Presenter)
public class TaskPresenter {
    private TaskModel model;
    private TaskView view;

    public TaskPresenter(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddTaskButtonClicked() {
        String task = view.getUserInput();
        model.addTask(task);
        updateView();
    }

    private void updateView() {
        List<String> tasks = model.getTasks();
        view.displayTasks(tasks);
    }
}
