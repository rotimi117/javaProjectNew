import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:  ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:  ");
        int number2 = scanner.nextInt();

        int square1 = number1 * number1;
        int square2 = number2 * number2;

        int sum = square1 + square2;
        int subtract = square1 - square2;


        System.out.println("square of the first integer:  " + square1);
        System.out.println("square of the second integer:  " + square2);
        System.out.println("sum of the integers:  " + sum);
        System.out.println("difference between the integers:  " + subtract);

    }
}
