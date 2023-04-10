import java.util.Scanner;

public class AddAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int result;

        do {
            System.out.println("enter the first number ");
            number1 = scanner.nextInt();

            System.out.println("enter the second number ");
            number2 = scanner.nextInt();

            int sum = number1 + number2;
            System.out.println("sum of the numbers: " + sum);

            System.out.println("do you want to continue y/n? ");
            result = scanner.nextInt();

            System.out.println();
        }while (result=='y' || result == 'y');
    }
}
