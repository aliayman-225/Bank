

package task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *This is the main that manages the bank functions,saving data and make logical and arithmeic calculation on it data only
 * @author Ali Ayman Ali
*/
public class Main 
{
    
    //ACCOUNT_NUMBER_LENGTH is a static attribute refers to number of cells that the account number will composed from it so it gives 1 billion different account numbers
    static final int ACCOUNT_NUMBER_LENGTH=9;
    
    /**
     * 
     * @return a random char from the 10 unique characters which are from 0 to 9
     */
    public static char generateRandomChar()
    {       
        String uniqueCharacters="0123456789";
        Random random=new Random();
        char uniqueChar;
        uniqueChar=uniqueCharacters.charAt(random.nextInt(uniqueCharacters.length()));
        return uniqueChar; 
    }
    /**
     * this function offers the user to add client or List all clients in the bank or make a withdrawal or deposit transaction
     * adding client to the bank must be done by take some inputs about the client and generating an account with a unique random account number for his account
     * for listing all the clients data it call a function display() from bank class
     * making a withdrawal or deposit transaction must be done by surely check that the account that we will make a transaction from it is belong to the owner
     * @param b1 it takes a bank object to store clients and accounts data on it , display data from it and make some logical and mathematical operations
     */
    public static void menu(Bank b1)
    {
        while(true)
        {
            String accountNumber="";
            System.out.println("1-Add client\n2-List all clients and their accounts\n3-Withdraw or Deposit\n4-Exit");
            Scanner input=new Scanner(System.in);
            try
            {
                int answer=input.nextInt();
                if (answer==1)
                {
                    for(int i=0;i<ACCOUNT_NUMBER_LENGTH;i++) //Generating a 9 random characters
                    {
                        accountNumber+=generateRandomChar();
                    }               
                    for(int i=0;i<b1.getAccountsList().size();i++) //To be sure that the 9 random characters given as accountNumber is unique and no one from the clients of the bank contains these account number
                    {
                        if(b1.getAccountsList().get(i).getAccountNumber().equals(accountNumber)) // if another client contains the same accountNumber that generated
                        {
                            for(int j=0;j<ACCOUNT_NUMBER_LENGTH;j++) //generate new random 9 characters for accountNumber
                            {
                                accountNumber+=generateRandomChar();
                            }
                             i=0; //to recheck for the new accountNumber
                        }
                    }
                    System.out.println("Enter client's type (1-client/2-commecial client)");
                    int clientType=input.nextInt();
                    input.nextLine();
                    switch (clientType)
                    {
                        case 1:
                        {
                            System.out.println("Enter client's name");
                            String name=input.nextLine();
                            System.out.println("Enter client's national ID");
                            String nationalID=input.nextLine();
                            System.out.println("Enter client's address");
                            String address=input.nextLine();
                            System.out.println("Enter client's phone number");
                            String phone=input.nextLine();
                            System.out.println("Enter client's account type (1-Normal account/2-Special account)");
                            int accountType=input.nextInt();
                            switch(accountType)
                            {
                                case 1:
                                {
                                    Account a1=new Account(accountNumber);
                                    Client c1 =new Client (name,nationalID,address,phone,a1);
                                    b1.addClientsAndAccounts(a1, c1);
                                    System.out.println("Client and its account are successfully activated, client's account number is : "+a1.getAccountNumber()+" (Client must keep it)");
                                    break;
                                }
                                case 2:
                                {
                                    SpecialAccount sa1=new SpecialAccount(accountNumber);
                                    Client c1 =new Client (name,nationalID,address,phone,sa1);
                                    b1.addClientsAndAccounts(sa1, c1); 
                                    System.out.println("Client and its account are successfully activated,client's account number is : "+sa1.getAccountNumber()+" (Client must keep it)");
                                    break;
                                }
                                default:
                                {
                                    System.out.println("ERORR : you supposed to type 1 or 2 to choose from these menu ");
                                }
                            }
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter commercial name");
                            String name=input.nextLine();
                            System.out.println("Enter commercial  ID");
                            String commercialID=input.nextLine();
                            System.out.println("Enter commercial address");
                            String address=input.nextLine();
                            System.out.println("Enter commercial phone number");
                            String phone=input.nextLine();
                            System.out.println("Enter commercial account type (1-Normal account/2-Special account)");
                            int accountType=input.nextInt();
                            switch(accountType)
                            {   
                                case 1:
                                {
                                    Account a1=new Account(accountNumber);
                                    CommercialClient c1 =new CommercialClient (name,address,phone,a1,commercialID);
                                    b1.addClientsAndAccounts(a1, c1);  
                                    System.out.println("The commercial and its account are successfully activated, commercial account number is : "+a1.getAccountNumber()+" (Commercial must keep it)");
                                    break;
                                }
                                case 2:
                                {
                                    SpecialAccount sa1=new SpecialAccount(accountNumber);
                                    CommercialClient c1 =new CommercialClient (name,address,phone,sa1,commercialID);
                                    b1.addClientsAndAccounts(sa1, c1); 
                                    System.out.println("The commercial and its account are successfully activated, commercial account number is : "+sa1.getAccountNumber()+" (Commercial must keep it)");
                                    break;
                                }
                                 default:
                                {
                                    System.out.println("ERORR : you supposed to type 1 or 2 to choose from these menu ");
                                }
                            }
                            break;
                        }
                        default:
                        {
                            System.out.println("ERORR : you supposed to type 1 or 2 to choose from these menu ");
                        }
                        
                    }
                }

                else if(answer==2)
                {
                    b1.display();
                }
                
                else if(answer==3)
                {
                    input.nextLine();
                    System.out.println("Enter account number composed of 9 numbers");
                    accountNumber=input.nextLine();
                    for(int i=0;i<b1.getAccountsList().size();i++)
                    {        
                        if((b1.getAccountsList().get(i).getAccountNumber()).equals(accountNumber))
                        {
                            System.out.println("account number exists");
                            if(!(b1.getClientsList().get(i).getNationalID().equals("00000000000000"))) // if it's nt a commercial account
                            {
                                System.out.println("Enter national ID of the client attached to this account");
                                String nationalID=input.nextLine();
                                if((b1.getClientsList().get(i).getNationalID()).equals(nationalID))
                                {
                                    System.out.println("correct national ID"); 
                                }
                                else
                                {
                                    System.out.println("Invalid national ID");
                                    break;
                                }
                            }
                            System.out.println("1-Withdraw\n2-Deposit");
                            int transaction=input.nextInt();
                            input.nextLine();
                            switch(transaction)
                            {
                                case 1:
                                {
                                    System.out.println("Enter the amount of money");
                                    double money=input.nextDouble();
                                    b1.getAccountsList().get(i).withdraw(money);
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Enter the amount of money");
                                    double money=input.nextDouble();
                                    b1.getAccountsList().get(i).deposit(money);
                                    break;
                                }
                                default:
                                {
                                    System.out.println("ERORR : you supposed to type 1 or 2 to choose from these menu ");
                                }
                            }
                        }
                        else if(i==b1.getAccountsList().size()-1)
                        {
                            System.out.println("Invalid account number");
                        }
                    }
                }
                else if(answer==4)
                {  
                    break;
                }
                else
                {
                    System.out.println("ERORR : please type a number from 1 to 4 to choose from these menu");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("ERORR : please type a number from 1 to 4 to choose from these menu");
            }
        }
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) 
    {            
       Bank b1=new Bank("CIB","October","19666");
       menu(b1);    
       
        // TODO code application logic here
    }
    
}
