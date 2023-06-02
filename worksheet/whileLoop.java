
import java.util.Scanner;

public class whileLoop {
    public static void main(String... arg) {
        Scanner input = new Scanner(System.in);
        int sales;
        int totalSales = 0;
        int counter = 0;
        while (counter < 5){
            System.out.println("Enter sale for product " +(counter));
            sales = input.nextInt();
            totalSales += sales;
            counter++;
            System.out.println("counter is now " + counter);
            System.out.println("sales is now " + sales);
            System.out.println("Total sales is now " + totalSales);
            System.out.println("\n");
        }
        System.out.println("Total sales is " + totalSales);
    }

}
