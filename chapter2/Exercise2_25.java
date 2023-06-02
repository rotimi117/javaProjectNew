import java.util.Scanner;

public class Exercise2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:  ");
        int number = input.nextInt();

        if (number % 3 == 0){
            System.out.println("number is divisibly by 3");
        }else {
            System.out.println("number is not divisibly by 3");
        }




    }
}
