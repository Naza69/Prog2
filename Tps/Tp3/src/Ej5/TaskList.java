package Ej5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class TaskList implements Iterable<Task> {
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, int priority) {
        tasks.add(new Task(description, priority));
        sortByPriority();
    }

    public void removeTask(String description) {
        tasks.removeIf(task -> task.getDescription().equals(description));
    }

    public int numberOfTasks() {
        return tasks.size();
    }

    private void sortByPriority() {
        Collections.sort(tasks, (t1, t2) -> t2.getPriority() - t1.getPriority());
    }

    @Override
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }
}
