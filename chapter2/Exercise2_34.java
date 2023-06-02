//World Population Growth Calculator
import java.util.Scanner;

public class Exercise2_34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current world population:  ");
        double current_population = input.nextInt();

        System.out.println("Enter anual growth rate:  ");
        double growth_rate = input.nextInt();

        double growth_percentage = (growth_rate / 100);

        double population_after_one_year = current_population * growth_percentage;
        double population_after_two_year = population_after_one_year * growth_percentage;
        double population_after_three_year = population_after_two_year * growth_percentage;
        double population_after_four_year = population_after_three_year * growth_percentage;
        double population_after_five_year = population_after_four_year * growth_percentage;

        System.out.println("Estimated world population after one year: " + population_after_one_year);
        System.out.println("Estimated world population after two year: " + population_after_two_year);
        System.out.println("Estimated world population after three year: " + population_after_three_year);
        System.out.println("Estimated world population after four year: " + population_after_four_year);
        System.out.println("Estimated world population after five year: " + population_after_five_year);

    }
}
