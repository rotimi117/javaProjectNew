import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeE = 0;
        int gradeF = 0;
        int totalscore = 0;
        System.out.println("how many student do you have? ");
        int numberOfStudents = input.nextInt();
        for (int i=0; i < numberOfStudents; i++){
            System.out.println("Enter a grade");
            int grade = input.nextInt();
            switch (grade / 10){
                case 8:
                case 9:
                case 10:
                    gradeA++;
                case 7:
                case 6:
                    gradeB++;
                case 5:
                case 4:
                    gradeC++;
                case 3:
                    gradeD++;
                case 2:
                    gradeE++;
                case 1:
                    gradeF++;
            }
            totalscore += grade;

        }
        System.out.printf("grade A -->%d%n", gradeA);
        System.out.printf("grade B -->%d%n", gradeB);
        System.out.printf("grade C -->%d%n", gradeC);
        System.out.printf("grade D -->%d%n", gradeD);
        System.out.printf("grade E -->%d%n", gradeE);
        System.out.printf("grade F -->%d%n", gradeF);

        double averageScore = (double) totalscore / numberOfStudents;
        System.out.printf("average score of %d student is %.2f", numberOfStudents, averageScore);





    }
}
