package Lab7.task2;

public class Main {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(795872, 0);
        BankAccount user2 = new BankAccount(859357, 0);
        BankAccount user3 = new BankAccount(298572, 0);

        user1.setBalance(150000);
        user1.getBalance();
        user1.deposit(100.5);
        user1.withdraw(150100);

        System.out.println();

        user2.setBalance(10);
        user2.getBalance();
        user2.deposit(20);
        user2.withdraw(1000);

        System.out.println();

        user3.setBalance(-100);
        user3.getBalance();
        user3.deposit(-100);
        user3.withdraw(-1);

    }
}
