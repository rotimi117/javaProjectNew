import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:  ");
        int number = input.nextInt();

        int square = number * number;

        if (number > 100 & square > 100) {
            System.out.println("number and its square are greater than 100 ");
        } else if (number == 100 & square == 100){
            System.out.println("number and its square are equals to 100");
        } else if (number != 100 & square != 100) {
            System.out.println("number and its square are not equals to 100 ");
        }else {
            System.out.println("number and its square are less than 100");
        }


    }
}
