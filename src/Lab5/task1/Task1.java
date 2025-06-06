package Lab5.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double monthlyDeposit;
        double annualRate;
        int years;
        int timesCompounded;
        double A;

        System.out.println("Введіть початковий внесок(P): ");
        principal = scanner.nextDouble();
        System.out.println("Введіть річну процентну ставку(r): ");
        annualRate = scanner.nextDouble();
        System.out.println("Введіть кількість нарахувань відсотків на рік(n): ");
        timesCompounded = scanner.nextInt();
        System.out.println("Введіть кількість років вкладу(t): ");
        years = scanner.nextInt();
        System.out.println("Введіть місячний платіж: ");
        monthlyDeposit = scanner.nextDouble();

        annualRate = annualRate/100;
        A = principal * Math.pow((1 + (annualRate/timesCompounded)), (timesCompounded * years));

        System.out.printf("The amount after %d years is: $%.2f", years, A);

        scanner.close();
    }
}
