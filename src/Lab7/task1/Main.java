package Lab7.task1;

public class Main {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(193284, 15000);

        System.out.println("Ваш номер: " + myAccount.getAccountNumber());

        System.out.println("Ваш баланс: " + myAccount.getBalance());

        //myAccount.deposit(975);
        //System.out.println("Ваш баланс: " + myAccount.getBalance());

        myAccount.withdraw(1000000);
        System.out.println("Ваш баланс: " + myAccount.getBalance());




        //System.out.println("Поповнити рахунок на ");



    }
}
