package Lab7.task1;

public class BankAccount {
    private final int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        }
        else {
            System.out.print("Помилка: ваш баланс від'ємний. ");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("Ваш баланс змінено, він дорівнює: " + balance);
        }
        else {
            System.out.println("Ваш рахунок не змінено");
        }
    }
    // поповнення коштів
    void deposit(double amount) {
        if (amount >= 0) {
            balance =+ amount;
            System.out.println("Ви поповнили свій рахунок! ");
        }
        else {
            System.out.println("Сума рахунку має бути бути більше 0.");
        }
    }
    // зняття коштів
    void withdraw(double amount) {
        if (amount < 0 && amount >= balance) {
            balance =- amount;
            System.out.println("Ви зняли кошти! ");
        }
        else if (amount > balance){
            System.out.println("У вас недостатньо грошів!");
        }
        else {
            System.out.println("Ви ввели некорекну суму для зняття, вона має бути більше 0.");
            this.balance = balance;
        }
    }
}
