import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("press 1 for English");
        System.out.println("press 2 for Yoruba");
        System.out.println("press 3 for Igbo");
        System.out.println("press 4 for Hausa");

        int language = scanner.nextInt();

        switch (language){
            case 1 -> System.out.println("English");
            case 2 -> System.out.println("Yoruba");
            case 3 -> System.out.println("Igbo");
            case 4 -> System.out.println("Hausa");


        }






    }
}