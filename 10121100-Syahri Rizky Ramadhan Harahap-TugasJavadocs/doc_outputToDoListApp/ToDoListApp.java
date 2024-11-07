import java.util.ArrayList;
import java.util.Scanner;

/**
 * The ToDoListApp class provides a console-based application to manage a to-do list.
 * Users can add, display, and remove tasks from the list.
 */
public class ToDoListApp {
    private ArrayList<String> tasks; // List to store tasks

    /**
     * Constructor to initialize an empty to-do list.
     */
    public ToDoListApp() {
        tasks = new ArrayList<>();
    }

    /**
     * Adds a task to the to-do list.
     *
     * @param task the task to be added
     */
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    /**
     * Displays all tasks in the to-do list.
     */
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    /**
     * Removes a task from the to-do list based on its position.
     *
     * @param index the position of the task to remove (1-based index)
     */
    public void removeTask(int index) {
        if (index <= 0 || index > tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            String removedTask = tasks.remove(index - 1);
            System.out.println("Task removed: " + removedTask);
        }
    }

    /**
     * Main method to run the console-based to-do list application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListApp toDoListApp = new ToDoListApp();
        boolean exit = false;

        System.out.println("Welcome to the To-Do List Application!");

        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    toDoListApp.addTask(task);
                    break;
                case 2:
                    toDoListApp.displayTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = scanner.nextInt();
                    toDoListApp.removeTask(index);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
