

package task2;
import java.text.NumberFormat;
/**
 * manages all types of accounts and responsible for withdraw and deposit transactions  
 * @author Omar Mohamed Mohamed Maamon
*/
public class Account
{
    private double balance;
    private String accountNumber;
       
    /**
     * Parameterized constructor
     * give an initial value to the balance of the account 
     * @param accountNumber takes the accountNumber attribute to initialize it with the passed integer value
    */
    public Account (String accountNumber)
    {
        balance=0;
        this.accountNumber=accountNumber;     
    }
    
    /**
     * Set the account balance
     * @param balance takes the double value passed and set it to balance attribute
     *  
    */
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    
    /**
     * get the balance attribute to display it or make calculations using it
     * @return the double value of the account balance
    */
    public double getBalance()
    {
        return balance;    
    }
    
    /**
     *Sets the accountNumber attribute
     *@param accountNumber sets the accountNumber attribute with the passed String value
    */
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;        
    }
   
    /**
     * get the accountNumber attribute to make logical calculations on it
     * @return the String accountNumber attribute 
    */
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    /**
     * 
     * Overriding the parent class object to get a displayable message to show all the account data
     * @return a string message 
    */
    @Override
    public String toString()
    {
        NumberFormat formatting=NumberFormat.getInstance();
        formatting.setGroupingUsed(true);
        return"======Account information======\n"+"Account number : "+accountNumber+"\nBalance : "+formatting.format(balance)+"\n===============================";  
    }
    
    /**
     * checks if the determined money sufficient to take it from balance account or not and display a clear message containing the current balance and old balance
     * @param money take the double value (amount of money) that wants to take from the balance
    */
    public void withdraw(double money)
    {
        NumberFormat formatting=NumberFormat.getInstance();
        formatting.setGroupingUsed(true);
        if(balance>=money)
        {
            
            System.out.println("******withdraw "+formatting.format(money)+" successfully******\nYour old balance : "+formatting.format(balance));
            balance-=money;
            System.out.println("Balance remaining : " + formatting.format(balance)+"\n***************************************");
        }
        else
        {
            System.out.println("******withdrawal failed as your balance does not sufficent******\nyour balance : "+formatting.format(balance)+"\n****************************************************************"); 
        }       
    }
    
    /**
     * provides the account balance with the determined money and display a clear message containing the current balance and old balance
     * @param money take the double value (amount of money) that wants to add the to the balance
    */
    public void deposit (double money)
    {
        NumberFormat formatting=NumberFormat.getInstance();
        formatting.setGroupingUsed(true);
        if(money>=0)
        {
            System.out.println("******deposit "+formatting.format(money)+" successfully******\nYour old balance : "+formatting.format(balance));
            balance+=money;
            System.out.println("Your current balance : "+formatting.format(balance)+"\n**************************************");
        }
        else
        {
            System.out.println("******failed transaction cannot deposit negative number******\nYour current balance : "+formatting.format(balance)+"\n*************************************************************"); 
        }
    }
    
}
