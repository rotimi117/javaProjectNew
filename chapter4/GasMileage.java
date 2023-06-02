import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double totalMiles = 0;
            double totalGallons = 0;
            double tripCount = 0;

            System.out.println("Enter the miles driven and gallons used for each trip (or -1 to quit):");
            int miles = scanner.nextInt();

            while (miles != -1) {
                double gallons = scanner.nextInt();

                totalMiles += miles;
                totalGallons += gallons;
                tripCount++;

                double miles_per_gallon = miles / gallons;
                System.out.printf("Miles per gallon for this trip: %.2f%n", miles_per_gallon);

                double combinedMPG = totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon for all trips: %.2f%n", combinedMPG);

                System.out.println();

                System.out.println("Enter the miles driven and gallons used for the next trip (or -1 to quit):");
                miles = scanner.nextInt();
            }

            System.out.println("Program terminated. Thank you for using GasMileage.");
        }
    }


