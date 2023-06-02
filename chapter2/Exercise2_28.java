import java.util.Scanner;

public class Exercise2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle:  ");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        double circumference = 2* Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("diameter: %.2f%n",diameter);
        System.out.printf("circumference: %.2f%n",circumference);
        System.out.printf("area: %.2f%n",area);

    }
}
