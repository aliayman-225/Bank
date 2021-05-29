
package task2;

/**
 * 
 *  manages all Clients data and responsible for give an account to each client <br>
 * @author Renad Ahmed Abdelbaky
*/
public class Client
{   
    private String name, nationalID,address,phone;
    private Account account;
    
    /**
     * parameterized constructor responsible for setting all the client's data
     * @param name takes the name to initialize it with the passed String value
     * @param nationalID takes the nationalID to initialize it with the passed String value
     * @param address takes the address to initialize it with the passed String value
     * @param phone takes the phone to initialize it with the passed String value
     * @param account  takes the account to initialize it with the passed account Object value
    */
    public Client(String name, String nationalID, String address,String phone ,Account account) 
    {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.account = account;
        this.phone=phone; 
    }
    
    /**
     *Set the name of the client
     * @param name takes the String value passed and set it to name attribute
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * get the name attribute to display it
     * @return the name of the client
    */
    public String getName()
    {
        return name;
    }
    
    /**
     * Set the nationalID of the client
     * @param nationalID takes the String value passed and set it to nationalID attribute
    */
    public void setNationalID(String nationalID) 
    {
        this.nationalID = nationalID;
    }
    
    /**
     * get the nationalID attribute to display it or make a logical calculations on it
     * @return the nationalID of the client
    */
    public String getNationalID() 
    {
        return nationalID;
    }
    
    /**
     * Set the address of the client
     * @param address takes the String value passed and set it to address attribute
    */
    public void setAddress(String address) 
    {
        this.address = address;
    }
    
    /**
     * get the address attribute to display it
     * @return the address of the client
    */
    public String getAddress()
    {
        return address;
    }

    /**
     * Set the phone of the client
     * @param phone takes the String value passed and set it to phone attribute
    */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    /**
     * get the phone attribute to display it
     * @return the phone of the client
    */
    public String getPhone() 
    {
        return phone;
    }
    
    /**
     * Set an account to a client
     * @param account takes the account object  passed and set it to account attribute
    */
    public void setAccount(Account account)
    {
        this.account = account;
    }
    
    /**
     * get the account attribute to display it or make logical an arithmetic calculations on it
     * @return the account of the client
    */
    public Account getAccount() 
    {
        return account;
    }
  
    /**
     * Overriding the parent class object to get a displayable message to show all the Client data
     * @return a string message 
    */ 
    @Override
    public String toString ()
    {
         return"===========Client information===========\n"+"Name : "+name+"\nNational ID : "+nationalID+"\nAddress : "+address+"\nPhone : "+phone+"\n"+account.toString()+"\n=========================================";    
    }
}
