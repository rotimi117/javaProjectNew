package tdd;

import jdk.jfr.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account sultanAccount = new Account();


    @Test
    public void accountCanBeCreatedTest(){
        //given
        Account mariamAccount;
        //when
        mariamAccount = new Account();
        //assert
        assertNotNull(mariamAccount);
    }

    @Test
    public void depositTest(){
       Account sultanAccount = new Account();
       sultanAccount.deposit(3000);
       assertEquals(3000,
               sultanAccount.getBalance());

    }

    @Test
    public void depositFiveThousandNairaTest(){
        sultanAccount.deposit(5_000);
        assertEquals(5_000, sultanAccount.getBalance());
    }

    @Test
    public void cannotDepositNegativeValueTest(){
        sultanAccount.deposit(-3_000);
        assertEquals(0, sultanAccount.getBalance());
    }

    @Test
    public void depositTwiceTest() {
        sultanAccount.deposit(2_000);
        sultanAccount.deposit(2_000);
        assertEquals(4_000, sultanAccount.getBalance());
    }

    @Test
    public void withdrawTest(){
        sultanAccount.deposit(2_000);
        sultanAccount.withdraw(1_915);
        assertEquals(85, sultanAccount.getBalance());
    }

    @Test
    public void negativeWithdrawTest(){
        sultanAccount.deposit(1_000);
        sultanAccount.withdraw(-1_000);
        assertEquals(1_000, sultanAccount.getBalance());
    }

    @Test
    @Name("test that you can not withdraw an amount greater than your balance")
    public void withdrawAmountGreaterThanBalanceTest(){
        sultanAccount.deposit(1_000);
        sultanAccount.withdraw(2_000);
        assertEquals(1_000, sultanAccount.getBalance());
    }
    @Test
    public void withdrawAmountLessThanBalanceTest(){
        sultanAccount.deposit(1000);
        sultanAccount.withdraw(500);
        assertEquals(500, sultanAccount.getBalance());
    }














}