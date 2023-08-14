package MVC.controller;

import MVC.model.Model;
import MVC.view.View;

import java.util.List;

// Контроллер (Controller)
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(String task) {
        model.addTask(task);
        updateView();
    }

    private void updateView() {
        List<String> tasks = model.getTasks();
        view.displayTasks(tasks);
    }
}

