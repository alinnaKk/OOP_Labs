package Lab7.task4;

public class UserAccount {
    public String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String enteredPassword) {
        if (enteredPassword == password)
            System.out.println("Правильний пароль! Ви упішно увійшли в свій профіль. ");
        else
            System.out.println("Пароль невірний!");
    }

}
