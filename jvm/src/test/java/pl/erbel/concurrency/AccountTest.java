package pl.erbel.concurrency;


import org.testng.annotations.Test;

public class AccountTest {

    Account account = new Account();

    //Race Condition
    @Test(invocationCount = 100, threadPoolSize = 10)
    public void accountTest() {
        account.modify(0.3f);
        account.showBalance();
    }


}