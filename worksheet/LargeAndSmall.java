import java.util.Scanner;

public class LargeAndSmall {
    public static void main(String[] args) {
        int small = 0;
        int large = 0;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();

        for (int i=0; i<number;i++){
            number = input.nextInt();
            if (number>large){
                large=number;
            }
            System.out.println("The largest is: " +large);
        }
         for (int i=0;number>0;){
             number = input.nextInt();
             if (number<small){
                 small=number;
                 System.out.println("the smallest is " +small);
             }


        }





    }
}
