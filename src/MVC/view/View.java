package MVC.view;

import MVC.controller.Controller;
import MVC.model.Model;

import java.util.List;

// Представление (View)
public class View {
    public void displayTasks(List<String> tasks) {
        System.out.println("Список задач:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}


// Главный класс
