import java.util.Scanner;
public class CreditLimitCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int accountNumber;
            double balance;
            double totalCharges;
            double totalCredits;
            double creditLimit;

            System.out.println("Enter customer details:");
            System.out.print("Account Number: ");
            accountNumber = scanner.nextInt();

            while (accountNumber != -1) {
                System.out.print("Balance at the beginning of the month: ");
                balance = scanner.nextDouble();

                System.out.print("Total charges this month: ");
                totalCharges = scanner.nextDouble();

                System.out.print("Total credits this month: ");
                totalCredits = scanner.nextDouble();

                System.out.print("Allowed credit limit: ");
                creditLimit = scanner.nextDouble();

                double newBalance = balance + totalCharges - totalCredits;

                System.out.println("Account Number: " + accountNumber);
                System.out.println("Credit Limit: " + creditLimit);
                System.out.println("Balance: " + newBalance);

                if (newBalance > creditLimit) {
                    System.out.println("Credit limit exceeded.");
                } else {
                    System.out.println("Credit limit not exceeded.");
                }

                System.out.println();

                System.out.print("Enter account number (or -1 to quit): ");
                accountNumber = scanner.nextInt();
            }

            System.out.println("Program terminated. Thank you for using CreditLimitCalculator.");
        }
    }


