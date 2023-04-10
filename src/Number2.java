import java.util.Scanner;

public class Number2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("numbers");
            int sum = 0;


            int conter = 1;
            while (conter <= 5) {
                System.out.println("enter score" );
                int score = input.nextInt();
                if (score >= 0 && score<=100) sum += score;

                conter = conter +1;sum += score;

            }


            System.out.println("total sum is" + sum);





        }
    }

