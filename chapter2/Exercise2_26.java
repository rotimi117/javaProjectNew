import java.util.Scanner;

public class Exercise2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int number1 = input.nextInt();

        System.out.println("Enter a number:   ");
        int number2 = input.nextInt();

        int triple_number1 = number1 * 3;
        int double_number2 = number2 * 2;

        if (triple_number1 % double_number2 == 0){
            System.out.println("number tripled is a multiple of the second number doubled");
        }else {
            System.out.println("number tripled is not a multiple of the second number doubled");
        }
    }
}
