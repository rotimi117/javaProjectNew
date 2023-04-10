import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int number;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        for (int i=0; i<10; i++) {

            number = scanner.nextInt();
            if (number < 0)
                negative++;
            else if (number > 0)
                positive++;
            else
                zero++;


        }
        System.out.println(" total positive number " + positive);
        System.out.println("total negative number " + negative);
        System.out.println("total zero " + zero );

    }
}
