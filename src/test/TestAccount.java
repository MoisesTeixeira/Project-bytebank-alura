package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import bank.Account;

public class TestAccount
{

    private final double DELTA = 0.001;

    Account accountOne = new Account();
    Account accountTwo = new Account();

    @Test
    public void mustKeepTheIndicatedAmount099()
    {
        accountOne.deposit(-1999.99);
        accountOne.withdraw(-1999.00, accountTwo);

        assertEquals(0.99, accountOne.getBalance(), DELTA);
    }

    @Test
    public void mustTransferTheIndicatedAmount1999()
    {
        accountOne.deposit(1999.99);
        accountOne.withdraw(1999.00, accountTwo);

        assertEquals(1999.00, accountTwo.getBalance(), DELTA);
    }
}