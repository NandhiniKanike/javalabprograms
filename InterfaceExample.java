interface BankAccount
{
    void deposit(int amount);
    void withdraw(int amount);
}
class SavingAccount implements BankAccount
{
    int balance;
    SavingAccount(int initialbalance)
    {
        balance=initialbalance;
    }
    public void deposit(int amt)
    {
        if(amt>0)
        {
             balance=balance+amt;
            System.out.println("Deposited amount is :"+amt);

        }
        else
        {
            System.out.println("Invalid deposit amount");
        }

    }
    public void withdraw(int amt)
    {
        if(amt >0 && amt<=balance)
        {
            balance=balance-amt;
            System.out.println("Withdraw amount is :"+amt);

        }
        else
        {
             System.out.println("Invalid or insufficient funds ");
        }

        }
        
    
    void displayTranscations()
    {
        System.out.println("Final Balance is "+balance);
       

    }

}
public class InterfaceExample 
{
    public static void main(String[] args) 
    {
        SavingAccount account = new SavingAccount(15000);
        System.out.println("Initial balance is :"+account.balance);
        account.deposit(500);
        account.withdraw(1000);
        account.displayTranscations();
        
    }
    
}
