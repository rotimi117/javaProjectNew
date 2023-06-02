import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Account myAccount = new Account("rotimi nicol");
//
//        System.out.printf("initial name is: %s%n%n", myAccount.getName());
//
//        System.out.println("please enter the name: ");
//        String theName = scanner.nextLine();
//        myAccount.setName(theName);
//        System.out.println();
//
//        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
//       Account account1 = new Account("roetimi nicol");
//       Account account2 = new Account("bukayo saka");
//
//        System.out.printf("account1 name is: %s%n", account1.getName());
//        System.out.printf("account2 name is: %s%n", account2.getName());


        Account account1 = new Account("rotimi nicol",2000.00);
        Account account2 = new Account("bukayo saka", -2000.00);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.println("Enter deposit amount for Account2");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());


    }
}
