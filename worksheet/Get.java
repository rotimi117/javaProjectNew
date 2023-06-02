import tdd.Account;

public class Get {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("victoria");
        System.out.println("before changeAccountName:  " + account);
        changeAccountName(account);
        System.out.println("after changeAccount:  "+ account);
    }

    private static void changeAccountName(Account account) { account.setName("dsvid");
    }
}
