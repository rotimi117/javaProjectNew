import java.util.Scanner;

public class SalesCommissionCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of items sold: ");
            int numberOfItems = scanner.nextInt();

            double totalSales = 0;

            for (int i = 1; i <= numberOfItems; i++) {
                System.out.print("Enter the value of item " + i + ": $");
                double itemValue = scanner.nextDouble();
                totalSales += itemValue;
            }

            double commissionRate = 0.09;
            double baseEarnings = 200;
            double commission = totalSales * commissionRate;
            double earnings = baseEarnings + commission;

            System.out.println("Total sales: $" + totalSales);
            System.out.println("Earnings: $" + earnings);

            System.out.println("Program terminated. Thank you for using SalesCommissionCalculator.");
        }
    }


