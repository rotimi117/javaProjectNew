import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= number)
        {
            factorial = factorial * i;
            i++;
        }


    }
}
