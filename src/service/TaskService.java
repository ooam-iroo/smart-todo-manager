package service;

import model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks;

    public TaskService(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

}
