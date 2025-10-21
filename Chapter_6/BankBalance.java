import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 0.03; 

        System.out.print("Enter your starting balance > ");
        double balance = scanner.nextDouble();

        int year = 0;
        int choice;

        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        choice = scanner.nextInt();

        while (choice == 1) {
            year++;
            balance += balance * rate; 
            System.out.println("After year " + year + " at " + rate + " interest rate, balance is $" + balance);

            System.out.print("Do you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = scanner.nextInt();
        }
    }
}
