package Lab11.rozdil1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<Boolean> taskStatus = new ArrayList<>();

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. View tasks");
            System.out.println("2. Add task");
            System.out.println("3. Mark task as done");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = taskStatus.get(i) ? "[Done] " : "[Pending] ";
                            System.out.println((i + 1) + ". " + status + tasks.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    taskStatus.add(false);
                    System.out.println("Task added!");
                    break;

                case 3:
                    System.out.print("Enter task number to mark as done: ");
                    int doneIndex;
                    try {
                        doneIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        break;
                    }
                    if (doneIndex >= 0 && doneIndex < tasks.size()) {
                        taskStatus.set(doneIndex, true);
                        System.out.println("Task marked as done!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex;
                    try {
                        deleteIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        break;
                    }
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        taskStatus.remove(deleteIndex);
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
