import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList list = new ToDoList();
        int choice;

        do {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = sc.nextLine();
                    list.addTask(name);
                    break;
                case 2:
                    list.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task ID to mark done: ");
                    int doneId = sc.nextInt();
                    list.markTaskDone(doneId);
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int delId = sc.nextInt();
                    list.deleteTask(delId);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);

        sc.close();
    }
}
