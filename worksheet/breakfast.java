import java.util.Scanner;

public class breakfast {
    public static void main(String[] args) {
        int[] scores = new int[5];
                scores[0] = 23;
                scores[1] = 24;
                scores[2] = 17;
                scores[3] = 22;
                scores[4] = 39;

        int total = 0;
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println("Team " + i + " = " + scores[i]);
            total += scores[i];
        }
        System.out.println("Total = " + total);
    }
}
