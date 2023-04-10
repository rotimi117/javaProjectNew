import java.util.Scanner;

public class Multiplication1 {

    public static void main(String[] args) {
        Scanner multiplication = new Scanner(System.in);

        System.out.println("enter a number ");
        int number = multiplication.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(number + "*" + (i+1) + "=" + (number * (i+1)));
        }
    }
}
