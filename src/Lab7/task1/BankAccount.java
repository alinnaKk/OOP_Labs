package Lab7.task1;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("Ваш баланс: " + balance);
        }
        else {
            System.out.println("Помилка! Баланс не зміненно.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Ви успішно поповнили рахунок: " + balance);
        }
        else {
            System.out.println("Помилка! Сума поповдення має бути більшне нуля! ");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount ) {
            balance -= amount;
            System.out.println("Ви успішно зняли кошти! Оновленний баланс: " + balance);
        }
        else if (amount <= 0)
            System.out.println("Помилка! Ви ввели суму меньше нуля! ");
        else if (balance < amount)
            System.out.println("Помилка! Недостатньо грошей на рахунку! ");
        else
            System.out.println("Невідома помилка! ");
        }
    }

