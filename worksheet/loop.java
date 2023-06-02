import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
                       int intialNumber;
                       int sum = 0;
        Scanner input = new Scanner(System.in);

          System.out.print("enter the first number: ");
          intialNumber = input.nextInt();

          while (intialNumber > sum){
              System.out.print("enter the summing number: ");
              int tapIn = input.nextInt();
              sum = sum + tapIn;
              if(sum >= intialNumber) break;

          }
        System.out.println(intialNumber);
        System.out.println(sum);
    }
}
