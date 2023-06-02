import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numbers");
        int sum = 0;


        int conter = 1;
        while (conter <= 5) {
            System.out.println("enter score" );
            int score = input.nextInt();
            sum += score;
            conter = conter +1;

        }


        System.out.println("total sum is" + sum);





    }
}
