
package task2;

/**
 * specially manages the commercial Clients data only  and responsible for give an account to each client 
 * @author Renad Ahmed AbdelBaky
*/
public class CommercialClient extends Client
{   
    private String commercialID;
    
    /**
     * parameterized constructor responsible for passing some of the data to the parent constructor to set all the commercial data
     * @param name takes the name to pass it to parent constructor to initialize it with the passed String value
     * @param address takes the address to pass it to parent constructor to initialize it with the passed String value
     * @param phone takes the phone to pass it to parent constructor to initialize it with the passed String value
     * @param account  takes the account to pass it to parent constructor to initialize it with the passed account Object value
     * @param commercialID takes the commercialID of the commercial to initialize it with the passed String value
    */
    public CommercialClient(String name,String address,String phone, Account account,String commercialID)
    {
        super(name,"00000000000000", address,phone ,account);
        this.commercialID=commercialID;
    }
    
    /**
     * Set the commercialID
     * @param commercialID takes the String value passed and set it to commercialID attribute
    */
    public void setCommercialID(String commercialID)
    {
        this.commercialID = commercialID;
    }
    
    /**
     * get the commercialID attribute to display it or make logical calculations with it it
     * @return the String value of the commercialID 
    */
    public String getCommercialID()
    {
        return commercialID;
    }
    
    /**
     * Overriding the parent class object to get a displayable message to show all the commercial data
     * @return a string message 
    */
    @Override
    public String toString ()
    {
         return"===========Commercial information===========\n"+"Name : "+this.getName()+"\nCommercial ID : "+commercialID+"\nAddress : "+this.getAddress()+"\nPhone : "+this.getPhone()+"\n"+(this.getAccount()).toString()+"\n=========================================";  
    }   
}

