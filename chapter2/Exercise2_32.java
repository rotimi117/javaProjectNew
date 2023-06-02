//Negative, Positive and Zero Values

import java.util.Scanner;

public class Exercise2_32 {
    public static void main(String[] args) {

        int negative_number = 0;
        int positive_number = 0;
        int zero = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number LAD!!  ");
        int number1 = input.nextInt();

        System.out.println("Enter a number LAD!!  ");
        int number2 = input.nextInt();

        System.out.println("Enter a number LAD!!  ");
        int number3 = input.nextInt();

        System.out.println("Enter a number LAD!!  ");
        int number4 = input.nextInt();

        System.out.println("Enter a number LAD!!  ");
        int number5 = input.nextInt();


        if (number1 < 0) {
            negative_number++;
        } else if (number1 > 0) {
            positive_number++;
        } else {
            zero++;
        }

        if (number2 < 0) {
            negative_number++;
        } else if (number2 > 0) {
            positive_number++;
        } else {
            zero++;
        }

        if (number3 < 0) {
            negative_number++;
        } else if (number3 > 0) {
            positive_number++;
        } else {
            zero++;
        }

        if (number4 < 0) {
            negative_number++;
        } else if (number4 > 0) {
            positive_number++;
        } else {
            zero++;
        }

        if (number5 < 0) {
            negative_number++;
        } else if (number5 > 0) {
            positive_number++;
        } else {
            zero++;
        }

        System.out.println("Number of negative   "  + negative_number);
        System.out.println("Number of positive " + positive_number);
        System.out.println("Number of zeros   "  + zero);




    }
}
