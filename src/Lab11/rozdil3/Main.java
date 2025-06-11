package Lab11.rozdil3;

import Lab11.rozdil3.handlers.TaskHandler;
import Lab11.rozdil3.services.TaskManager;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        TaskHandler taskHandler = new TaskHandler(taskManager);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) {
                System.out.println("👋 Exiting To-Do List App. Have a great day!");
                break;
            }
            taskHandler.handleUserChoice(choice);
        }
    }

    private static void displayMenu() {
        System.out.println("\nTo-Do List App");
        System.out.println("1. Add Task");
        System.out.println("2. Add Recurring Task");
        System.out.println("3. Add High-Priority Task");
        System.out.println("4. List Tasks");
        System.out.println("5. Mark Task as Done");
        System.out.println("6. Delete Task");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
}

// Питання для самоперевірки

// 1. Найскладнішим у переході від структурного до ООП було навчитися розкладати "послідовну" логіку по класах.
// 2. При винесенні логіки у класи та методи код став чистішим та струкрурованим, також стало зручніше розширювати і повторно використовувати.
// 3. Якби треба було додати новий тип задачі (наприклад, з дедлайном), то можна було додати новий клас з методом для перевірки, який у свою чергу наслідував Task.
// 4. Краще використовувати винятки, ніж просто if, бо if не зупиняє програму, і може щось пропустити.
// 5. При поділі на пакети все більш структуровано, тому легше орієнтуватися і нічого не губиться.

// 6. Різниця між BaseTask і його нащадками у тому, що BaseTask це загальна основа (абстрактний клас),
// а нащадки додають щось своє грунтуючись на базовому класі, який вони унаслідують. Завдяки поліморфізму, з усіма цими класами
// можна працювати як з BaseTask, але кожен об’єкт реалізує свою поведінку, коли викликаються спільні методи.
