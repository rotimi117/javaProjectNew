import java.util.Scanner;

public class Population {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentPopulation;
        int year1;
        int year2;
        int year3;
        int year4;
        int year5;
        int growthRate;

        System.out.println("Enter current world population ");
        currentPopulation = input.nextInt();

        System.out.println("Enter anual growth rate ");
        growthRate = input.nextInt();
        growthRate = growthRate / 100;

        year1 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("world population after one year %.0f\n"  ,year1);

        currentPopulation = year1;

        year2 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("world population after two years  %.0f\n", year2);

        currentPopulation = year2;

        year3 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("world population after three years %.0f\n", year3);

        currentPopulation = year3;

        year4 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("world population after four years %.0f\n", year4);

        currentPopulation = year4;

        year5 = currentPopulation + (currentPopulation * growthRate);
        System.out.printf("world population after five years %.0f\n", year5);
    }
}
