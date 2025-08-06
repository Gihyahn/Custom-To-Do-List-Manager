import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        int choice;

        do {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Count tasks (Bonus)");
            System.out.println("6. Insert task at index (Bonus)");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    toDoList.addTask(title);
                    break;
                case 2:
                    System.out.print("Enter task title to delete: ");
                    String deleteTitle = scanner.nextLine();
                    toDoList.deleteTask(deleteTitle);
                    break;
                case 3:
                    toDoList.printTasks();
                    break;
                case 4:
                    System.out.print("Enter task title to search: ");
                    String searchTitle = scanner.nextLine();
                    if (toDoList.contains(searchTitle)) {
                        System.out.println("\nTask found!");
                    } else {
                        System.out.println("\nTask not found.");
                    }
                    break;
                case 5:
                    System.out.println("\nTotal tasks: " + toDoList.countTasks());
                    break;
                case 6:
                    System.out.print("Enter index to insert task: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter task title: ");
                    String taskAtIndex = scanner.nextLine();
                    toDoList.insertAt(index, taskAtIndex);
                    break;
                case 7:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
