
package task2;


import java.util.ArrayList;
/**
 * manages all the data of clients and their accounts 
 * @author Ali Ayman Ali Mohamed
*/

public class Bank 
{
    
    private String name,address,phone;
    private ArrayList <Account> accountsList=new ArrayList<Account>();
    private ArrayList <Client> clientsList=new ArrayList<Client>();
    
    /**
     * parameterized constructor responsible for setting all the Bank's data
     * @param name takes the name to initialize it with the passed String value
     * @param address takes the address to initialize it with the passed String value 
     * @param phone takes the phone to initialize it with the passed String value
    */
    public Bank(String name,String address,String phone)
    {
        this.name=name;
        this.address=address;
        this.phone=phone;    
    }
    
    /**
     *Set the name of the Bank
     * @param name takes the String value passed and set it to name attribute
    */
    public void setName(String name)
    {
        this.name=name;  
    }
     
    /**
     * get the name attribute to display it
     * @return the name of the Bank
    */
    public String getName()
    {
        return name;    
    }
    
    /**
     * Set the address of the Bank
     * @param address takes the String value passed and set it to address attribute
    */
    public void setAddress(String address)
    {
        this.address=address;    
    }
    
    /**
     * get the address attribute to display it
     * @return the address of the Bank
    */
    public String getAddress()
    {
        return address;       
    }
    
    /**
     * Set the phone of the Bank
     * @param phone takes the String value passed and set it to phone attribute
    */
    public void setPhone(String phone)
    {
        this.phone=phone;        
    }
    
    /**
     * get the phone attribute to display it
     * @return the phone of the Bank
    */
    public String getPhone()
    {
        return phone;      
    }
    
    /**
     * get the accountsList arrayList to display and make logical and arithmetic calculations
     * @return list of the accounts
    */
    public ArrayList<Account> getAccountsList()
    {
        return accountsList;
    }

    /**
     * get the clientsList arrayList to display and make logical and arithmetic calculations
     * @return list of the clients
    */
    public ArrayList<Client> getClientsList() 
    {
        return clientsList;
    }

    /**
     * Add the account data and client data to the two ArrayList
     * @param account takes the Account object passed and add it to the ArrayList accountsList
     * @param client takes the Client object passed and add it to the ArrayList clientsList
    */
    public void addClientsAndAccounts(Account account,Client client)
    {
        accountsList.add(account);
        clientsList.add(client);     
    }
    
    /**
     * Checks if the Array list still have another clients or not and start displaying the data of the client with their accounts
    */
    public void display()
    {
        for(int i=0;i<clientsList.size();i++)
        {
            System.out.println(clientsList.get(i).toString());
        } 
    }  
}
