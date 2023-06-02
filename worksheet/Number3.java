import java.util.Scanner;

public class Number3 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sum = 0;


            int conter = 1;
            int validNumber = 0;

            while (conter <= 5) {
                System.out.println("enter score" );
                int score = input.nextInt();
                if (score >= 0 && score <= 100) {
                    sum += score;
                  validNumber++;
                }
                conter = conter +1;
            }   


            System.out.println("total sum is" + sum);
            System.out.println("average is " + (sum/validNumber));





        }
    }

