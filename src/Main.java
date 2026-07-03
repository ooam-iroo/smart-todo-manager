import model.Priority;
import model.Task;
import service.TaskService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        TaskService taskService = new TaskService();

        Task task = new Task(
                1,
                "Learn Java",
                "Study OOP and Collections",
                Priority.HIGH,
                LocalDate.of(2026, 7, 10),
                false
        );

        taskService.addTask(task);

        System.out.println(taskService.getAllTasks());

    }
}