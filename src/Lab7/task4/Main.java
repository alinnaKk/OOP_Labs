package Lab7.task4;

public class Main {
    public static void main(String[] args) {
        UserAccount user1 = new UserAccount("alinakk", "password11");

        user1.login("password12");
        System.out.println();
        user1.login("password11");
    }
}
