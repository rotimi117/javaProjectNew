//Statistics for the Great Pyramid of Giza
public class Exercise2_35 {
    public static void main(String[] args) {

        int number_of_stone = 4000000;
        double averageWeightPerStone = 2000.00;
        int years = 30;
        int daysInAyear = 365;
        int hoursInAday = 24;
        int minutesInAnhour = 60;

        double totalWeight = number_of_stone * averageWeightPerStone;
        double weightBuiltPerYear = totalWeight / years;
        double weightBuiltPerHour = weightBuiltPerYear / (daysInAyear * hoursInAday);
        double weightBuiltPerMinute = weightBuiltPerHour / minutesInAnhour;

        System.out.println("Estimated number of stones used:  " + number_of_stone);
        System.out.println("Average weight of each stone: " + averageWeightPerStone);
        System.out.println("Number of years taken to build the pyramid:  " + years);
        System.out.println("Estimated weight of the pyramid:  " + totalWeight);
        System.out.println("Weight built per year:  " + weightBuiltPerHour);
        System.out.println("Weight built per hour:  " + weightBuiltPerHour);
        System.out.println("Weight built per minute:  " + weightBuiltPerMinute);
    }
}
