import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:  ");
        int number1 = input.nextInt();

        System.out.println("Enter the second integer:  ");
        int number2 = input.nextInt();

        System.out.println("Enter the third integer: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;

        int average = sum / 2;

        int product = number1 * number2 * number3;

        int smallest = number1;
        if (number2 < smallest){
            smallest = number2;
        }
        if (smallest < number3){
            smallest = number3;
        }
        int largest = number1;
        if (number2 > largest){
            largest = number2;
        }
        if (number3 > largest){
            largest = number3;
        }

        System.out.println("The sum: " + sum);
        System.out.println("The average: " + average);
        System.out.println("The product:  "+ product);
        System.out.println("The smallest:  " + smallest);
        System.out.println("The largest:  " + largest);
    }
}
