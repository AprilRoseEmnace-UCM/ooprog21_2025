import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        double startingBalance;
        double currentBalance;
        int currentYear;
        double interestRate;
        final double MIN_RATE = 0.02;
        final double MAX_RATE = 0.05;
        final double RATE_STEP = 0.01;
        final int TOTAL_YEARS = 4;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        startingBalance = input.nextDouble();
        input.nextLine();

        for (interestRate = MIN_RATE; interestRate <= MAX_RATE; interestRate += RATE_STEP) {
            currentBalance = startingBalance;
            System.out.println("\nWith an initial balance of $" + currentBalance +
                               " at an interest rate of " + interestRate);

            for (currentYear = 1; currentYear <= TOTAL_YEARS; ++currentYear) {
                currentBalance = currentBalance + currentBalance * interestRate;
                System.out.println("After year " + currentYear + ", balance is $" + currentBalance);
            }
        }
    }
}
