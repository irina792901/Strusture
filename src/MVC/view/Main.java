package MVC.view;

import MVC.controller.Controller;
import MVC.model.Model;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.addTask("Подготовить презентацию");
        controller.addTask("Закончить проект");
        controller.addTask("Сделать покупки");

        // Результат:
        // Список задач:
        // - Подготовить презентацию
        // - Закончить проект
        // - Сделать покупки
    }
}