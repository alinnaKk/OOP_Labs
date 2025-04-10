package Lab4.task6;

public class Task6 {
    public static void printNumber() {
        int num = 10;
        System.out.println("Локальна змінна (num) методу (printNumber): " + num);
    }

    public static void main(String[] args) {
        int num = 200;
        printNumber();
        System.out.println("Змінна (num) з main: " + num);

    }
}

// Помилки немає, бо num це локальна змінна методу printNumber(), її обаласть видимості обмежена в цьому методі (до фігурних дужок).
// Main цю змінну "не бачить", тому ми можемо створити нову змінну з таким самим ім'ям, її область видимості буде обмежена в main.
// Помилок не буде, бо це різні локальні змінні.
