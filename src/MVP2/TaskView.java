package MVP2;

import java.util.List;

// Представление (View)
public interface TaskView {
    void displayTasks(List<String> tasks);

    String getUserInput();
}
