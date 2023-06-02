import java.util.Scanner;

public class PrimeNumber {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter the positive integer ");
        number = scanner.nextInt();

        boolean display = true;

        for (int i = 2; i < number; i++){
            if(number % i == 0)
            {
                display = false;
                break;
            }
        }
        if(display && number > 1)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime ");
        }

    }
}
