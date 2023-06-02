//Body Mass Index Calculator

import java.util.Scanner;

public class Exercise2_33 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of user:  ");
        int weight = input.nextInt();
        int Weight = weight * 703;

        System.out.println("Enter the height of user:  ");
        int height = input.nextInt();
        int Height = height * height;

        int bmi = Weight / Height;
        System.out.println(bmi);



    }
}
