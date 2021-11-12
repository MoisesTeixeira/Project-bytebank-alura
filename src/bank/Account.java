package bank;

public class Account
{
    private double balance;
    private Client holder;

    public double getBalance()
    {
        return balance;
    }
    
    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public void deposit(double value)
    {
        balance += Math.abs(value);   
    }
    
    public void withdraw(double value, Account account)
    {
        value = Math.abs(value);
        
        if (balanceValidation(value))
        {
            balance -= value;
            account.deposit(value);
        }
    }

    public boolean balanceValidation(double value)
    {
        value = Math.abs(value);

        if (value <= balance)
            return true;
            
        return false;
    }
}