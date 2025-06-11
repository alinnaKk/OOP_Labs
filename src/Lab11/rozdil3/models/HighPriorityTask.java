package Lab11.rozdil3.models;

public class HighPriorityTask extends Task {
    private int priorityLevel;

    public HighPriorityTask(int id, String title, int priorityLevel) {
        super(id, title);
        this.priorityLevel = priorityLevel;
    }

    @Override
    public void markAsDone() {
        super.markAsDone();
        System.out.println("🚀 High-Priority Task Completed! Notification Sent.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Priority Level: " + priorityLevel;
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