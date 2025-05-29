package Lab7.task5;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    // Гетери
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Сетери з перевіркою значень
    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            System.out.println("Некоректне значення годин (0-23)");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Некоректне значення хвилин (0-59)");
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("Некоректне значення секунд (0-59)");
        }
    }

    // Метод для відображення поточного часу
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Метод tick() — додає одну секунду
    public void tick() {
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
                if (hours > 23) {
                    hours = 0;
                }
            }
        }
    }
}