import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("numbers");
        int x = input.nextInt();

        int counter = 1;
        while (counter < 10) {
            System.out.println(counter);
            counter = counter +2;
        }
    }


}