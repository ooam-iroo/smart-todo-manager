package util;

import model.Priority;
import model.Task;
import service.TaskService;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private final TaskService taskService;

    public Menu() {
        this.scanner = new Scanner(System.in);
        taskService = new TaskService();
    }

    public void showMenu() {

        System.out.println("\n===== Smart Todo Manager =====");
        System.out.println("1. Add Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

    }

    public int getUserChoice(){
        showMenu();
        return scanner.nextInt();
    }

    public void addTask() {

        scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Priority (LOW, MEDIUM, HIGH): ");
        Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Due Date (yyyy-MM-dd): ");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());

        int id = taskService.getAllTasks().size() + 1;

        Task task = new Task(
                id,
                title,
                description,
                priority,
                dueDate,
                false
        );

        taskService.addTask(task);

        System.out.println("\n✅ Task added successfully!");
    }

    public void showTasks() {

        for (Task task : taskService.getAllTasks()) {
            System.out.println(task);
        }

    }

}
