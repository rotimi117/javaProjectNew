import java.util.Scanner;

public class Gas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int miles;
            int gallons;
            int totalMiles = 0;
            int totalGallons = 0;

            System.out.println("Enter the miles driven and gallons used for each trip.");
            System.out.println("Enter -1 for both miles and gallons to exit.");


            while (true) {
                System.out.print("Enter miles (-1 to exit): ");
                miles = scanner.nextInt();
                if (miles == -1) {
                    break;
                }

                System.out.print("Enter gallons: ");
                gallons = scanner.nextInt();
                if (gallons == -1) {
                    break;
                }


                double mpg = (double) miles / gallons;
                System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);


                totalMiles += miles;
                totalGallons += gallons;

                double combinedMpg = (double) totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon for all trips: %.2f%n%n", combinedMpg);
            }

            System.out.println("Exiting the program.");
            scanner.close();
        }
    }


