import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

       int  weight_in_pounds = 0;
       int height_in_inches = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight ");
        int weight = input.nextInt();
        int Weight = weight * 703;


        System.out.println("Enter your height ");
        int height = input.nextInt();
        int Height = height * height;



       int Bmi = Weight / Height;
       System.out.printf("Bmi is %d%n ", Bmi);



    }
}
