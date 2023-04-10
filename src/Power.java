import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base;
        int power;
        int number = 1;
        System.out.println("enter the base number ");
        base = scanner.nextInt();

        System.out.println("enter the power number ");
        power = scanner.nextInt();

        for (int i=1; i<= power; i++){
            number *= base;
        }
        System.out.println("number: " + number);
    }
}
