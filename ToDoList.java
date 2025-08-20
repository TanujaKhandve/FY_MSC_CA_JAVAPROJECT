import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;
    private int count;

    public ToDoList() {
        tasks = new ArrayList<>();
        count = 1;
    }

    public void addTask(String name) {
        tasks.add(new Task(count++, name));
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if(tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }
        System.out.println("Tasks:");
        for(Task t : tasks) {
            System.out.println(t);
        }
    }

    public void markTaskDone(int id) {
        for(Task t : tasks) {
            if(t.getId() == id) {
                t.markDone();
                System.out.println("Task marked as done!");
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void deleteTask(int id) {
        for(Task t : tasks) {
            if(t.getId() == id) {
                tasks.remove(t);
                System.out.println("Task deleted successfully!");
                return;
            }
        }
        System.out.println("Task not found!");
    }
}
