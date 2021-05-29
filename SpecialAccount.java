
package task2;

import java.text.NumberFormat;

/**
 * specially manages the special accounts, accounts that have a limit of dept in withdrawal transactions  
 * @author Omar Mohamed Maamon
*/

public class SpecialAccount extends Account
{
    /**
    *parametrized constructor
    *passes the accountNumber to the parent constructor to initialize it and give an initial value to the balance of the account 
    *@param accountNumber  takes the accountNumber attribute to initialize it with the passed integer value in parent constructor
    */
    public SpecialAccount(String accountNumber)
    {
        super(accountNumber);
    }
    
    /**
     * 
     * Overriding the parent class Account checks if the determined money sufficient or not sufficient with limited value to take it from balance account or not and display a clear message containing the current balance and old balance
     * @param money  take the double value (amount of money) that wants to take from the balance 
    */
    @Override
    public void withdraw(double money)
    {
        NumberFormat formatting=NumberFormat.getInstance();
        formatting.setGroupingUsed(true);
        if(this.getBalance()+1000>=money && money>0)
        {
            System.out.println("******withdraw "+formatting.format(money)+" successfully******\nYour old balance : "+formatting.format(this.getBalance()));        
            this.setBalance(this.getBalance()-money);
            System.out.println("Balance remaining : " + formatting.format(this.getBalance())+"\n****************************************");
        }
        else
        {
            System.out.println("******withdrawal failed as your balance does not sufficent******\nyour balance : "+formatting.format(this.getBalance())+"\n****************************************************************");      
        }
    }
}
